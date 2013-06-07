/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.internal.jdt.imports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.WildcardType;
import org.eclipse.jdt.core.dom.rewrite.ImportRewrite;
import org.eclipse.text.edits.TextEdit;

/**
 * <h3>{@link OrganizeImportsHelper}</h3> Contains method from<br>
 * org.eclipse.jdt.internal.ui.text.correction.ASTResolving<br>
 * org.eclipse.jdt.internal.corext.util.Strings<br>
 * org.eclipse.jdt.ui.CodeStyleConfiguration<br>
 * org.eclipse.jdt.internal.corext.util.JavaModelUtil<br>
 * 
 * @author mvi
 * @since 3.9.0 23.05.2013
 */
public final class OrganizeImportsHelper {

  private final static Pattern SEMICOLON_PATTERN = Pattern.compile(";");
  private final static String ID_PLUGIN = "org.eclipse.jdt.ui";
  private final static String ORGIMPORTS_IMPORTORDER = "org.eclipse.jdt.ui.importorder";
  private final static String ORGIMPORTS_ONDEMANDTHRESHOLD = "org.eclipse.jdt.ui.ondemandthreshold";
  private final static String ORGIMPORTS_STATIC_ONDEMANDTHRESHOLD = "org.eclipse.jdt.ui.staticondemandthreshold";

  public static final int CLASSES = 1 << 1;
  public static final int INTERFACES = 1 << 2;
  public static final int ANNOTATIONS = 1 << 3;
  public static final int ENUMS = 1 << 4;
  public static final int VARIABLES = 1 << 5;
  public static final int PRIMITIVETYPES = 1 << 6;
  public static final int VOIDTYPE = 1 << 7;
  public static final int REF_TYPES = CLASSES | INTERFACES | ENUMS | ANNOTATIONS;
  public static final int REF_TYPES_AND_VAR = REF_TYPES | VARIABLES;
  public static final int ALL_TYPES = PRIMITIVETYPES | REF_TYPES_AND_VAR;

  public static int getPossibleTypeKinds(ASTNode node, boolean is50OrHigher) {
    int kinds = internalGetPossibleTypeKinds(node);
    if (!is50OrHigher) {
      kinds &= (INTERFACES | CLASSES);
    }
    return kinds;
  }

  public static BodyDeclaration findParentBodyDeclaration(ASTNode node) {
    while ((node != null) && (!(node instanceof BodyDeclaration))) {
      node = node.getParent();
    }
    return (BodyDeclaration) node;
  }

  public static Statement findParentStatement(ASTNode node) {
    while ((node != null) && (!(node instanceof Statement))) {
      node = node.getParent();
      if (node instanceof BodyDeclaration) {
        return null;
      }
    }
    return (Statement) node;
  }

  public static String getSimpleNameIdentifier(Name name) {
    if (name.isQualifiedName()) {
      return ((QualifiedName) name).getName().getIdentifier();
    }
    else {
      return ((SimpleName) name).getIdentifier();
    }
  }

  public static IBinding getDeclaration(IBinding binding) {
    switch (binding.getKind()) {
      case IBinding.TYPE:
        return ((ITypeBinding) binding).getTypeDeclaration();
      case IBinding.VARIABLE:
        return ((IVariableBinding) binding).getVariableDeclaration();
      case IBinding.METHOD:
        return ((IMethodBinding) binding).getMethodDeclaration();
    }
    return binding;
  }

  /**
   * Returns the type binding of the node's type context or null if the node is inside
   * an annotation, type parameter, super type declaration, or Javadoc of a top level type.
   * The result of this method is equal to the result of {@link #getBindingOfParentType(ASTNode)} for nodes in the
   * type's body.
   * 
   * @param node
   *          an AST node
   * @return the type binding of the node's parent type context, or <code>null</code>
   */
  public static ITypeBinding getBindingOfParentTypeContext(ASTNode node) {
    StructuralPropertyDescriptor lastLocation = null;

    while (node != null) {
      if (node instanceof AbstractTypeDeclaration) {
        AbstractTypeDeclaration decl = (AbstractTypeDeclaration) node;
        if (lastLocation == decl.getBodyDeclarationsProperty()
            || lastLocation == decl.getJavadocProperty()) {
          return decl.resolveBinding();
        }
        else if (decl instanceof EnumDeclaration && lastLocation == EnumDeclaration.ENUM_CONSTANTS_PROPERTY) {
          return decl.resolveBinding();
        }
      }
      else if (node instanceof AnonymousClassDeclaration) {
        return ((AnonymousClassDeclaration) node).resolveBinding();
      }
      lastLocation = node.getLocationInParent();
      node = node.getParent();
    }
    return null;
  }

  /**
   * Returns the closest ancestor of <code>node</code> whose type is <code>nodeType</code>, or <code>null</code> if
   * none.
   * <p>
   * <b>Warning:</b> This method does not stop at any boundaries like parentheses, statements, body declarations, etc.
   * The resulting node may be in a totally different scope than the given node. Consider using one of the
   * {@link ASTResolving}<code>.find(..)</code> methods instead.
   * </p>
   * 
   * @param node
   *          the node
   * @param nodeType
   *          the node type constant from {@link ASTNode}
   * @return the closest ancestor of <code>node</code> whose type is <code>nodeType</code>, or <code>null</code> if none
   */
  public static ASTNode getParent(ASTNode node, int nodeType) {
    do {
      node = node.getParent();
    }
    while (node != null && node.getNodeType() != nodeType);
    return node;
  }

  public static String getFullName(Name name) {
    return name.getFullyQualifiedName();
  }

  public static ASTNode getNormalizedNode(ASTNode node) {
    ASTNode current = node;
    // normalize name
    if (QualifiedName.NAME_PROPERTY.equals(current.getLocationInParent())) {
      current = current.getParent();
    }
    // normalize type
    if (QualifiedType.NAME_PROPERTY.equals(current.getLocationInParent()) ||
        SimpleType.NAME_PROPERTY.equals(current.getLocationInParent())) {
      current = current.getParent();
    }
    // normalize parameterized types
    if (ParameterizedType.TYPE_PROPERTY.equals(current.getLocationInParent())) {
      current = current.getParent();
    }
    return current;
  }

  /**
   * Returns the type binding of the node's enclosing type declaration.
   * 
   * @param node
   *          an AST node
   * @return the type binding of the node's parent type declaration, or <code>null</code>
   */
  public static ITypeBinding getBindingOfParentType(ASTNode node) {
    while (node != null) {
      if (node instanceof AbstractTypeDeclaration) {
        return ((AbstractTypeDeclaration) node).resolveBinding();
      }
      else if (node instanceof AnonymousClassDeclaration) {
        return ((AnonymousClassDeclaration) node).resolveBinding();
      }
      node = node.getParent();
    }
    return null;
  }

  /**
   * Tests if a char is lower case. Fix for 26529.
   * 
   * @param ch
   *          the char
   * @return return true if char is lower case
   */
  public static boolean isLowerCase(char ch) {
    return Character.toLowerCase(ch) == ch;
  }

  public static ImportRewrite createImportRewrite(CompilationUnit astRoot, boolean restoreExistingImports) throws JavaModelException {
    ImportRewrite rewrite = configureImportRewrite(ImportRewrite.create(astRoot, restoreExistingImports));
    if (astRoot.getAST().hasResolvedBindings()) {
      rewrite.setUseContextToFilterImplicitImports(true);
    }
    return rewrite;
  }

//  public static String getPreference(String key, IJavaProject project) {
//    String val;
//    if (project != null) {
//      val = new ProjectScope(project.getProject()).getNode(ID_PLUGIN).get(key, null);
//      if (val != null) {
//        return val;
//      }
//    }
//    val = InstanceScope.INSTANCE.getNode(ID_PLUGIN).get(key, null);
//    if (val != null) {
//      return val;
//    }
//    return DefaultScope.INSTANCE.getNode(ID_PLUGIN).get(key, null);
//  }

  /**
   * Applies an text edit to a compilation unit. Filed bug 117694 against jdt.core.
   * 
   * @param cu
   *          the compilation unit to apply the edit to
   * @param edit
   *          the edit to apply
   * @param save
   *          is set, save the CU after the edit has been applied
   * @param monitor
   *          the progress monitor to use
   * @throws CoreException
   *           Thrown when the access to the CU failed
   * @throws ValidateEditException
   *           if validate edit fails
   */
  public static void applyEdit(ICompilationUnit cu, TextEdit edit, boolean save, IProgressMonitor monitor) throws CoreException, ValidateEditException {
    IFile file = (IFile) cu.getResource();
    if (!save || !file.exists()) {
      cu.applyTextEdit(edit, monitor);
    }
    else {
      if (monitor == null) {
        monitor = new NullProgressMonitor();
      }
//      monitor.beginTask(CorextMessages.JavaModelUtil_applyedit_operation, 2);
      try {
        IStatus status = makeCommittable(file, null);
        if (!status.isOK()) {
          throw new ValidateEditException(status);
        }

        cu.applyTextEdit(edit, new SubProgressMonitor(monitor, 1));

        cu.save(new SubProgressMonitor(monitor, 1), true);
      }
      finally {
        monitor.done();
      }
    }
  }

  /**
   * Makes the given resource committable. Committable means that it is
   * writeable and that its content hasn't changed by calling <code>validateEdit</code> for the given resource on
   * <tt>IWorkspace</tt>.
   * 
   * @param resource
   *          the resource to be checked
   * @param context
   *          the context passed to <code>validateEdit</code>
   * @return status describing the method's result. If <code>status.isOK()</code> returns <code>true</code> then the
   *         resources are committable.
   * @see org.eclipse.core.resources.IWorkspace#validateEdit(org.eclipse.core.resources.IFile[], java.lang.Object)
   */
  public static IStatus makeCommittable(IResource resource, Object context) {
    return makeCommittable(new IResource[]{resource}, context);
  }

  /**
   * Makes the given resources committable. Committable means that all
   * resources are writeable and that the content of the resources hasn't
   * changed by calling <code>validateEdit</code> for a given file on <tt>IWorkspace</tt>.
   * 
   * @param resources
   *          the resources to be checked
   * @param context
   *          the context passed to <code>validateEdit</code>
   * @return IStatus status describing the method's result. If <code>status.
   * isOK()</code> returns <code>true</code> then the add resources are
   *         committable
   * @see org.eclipse.core.resources.IWorkspace#validateEdit(org.eclipse.core.resources.IFile[], java.lang.Object)
   */
  public static IStatus makeCommittable(IResource[] resources, Object context) {
    List<IResource> readOnlyFiles = new ArrayList<IResource>();
    for (int i = 0; i < resources.length; i++) {
      IResource resource = resources[i];
      if (resource.getType() == IResource.FILE && isReadOnly(resource)) readOnlyFiles.add(resource);
    }
    if (readOnlyFiles.size() == 0) return Status.OK_STATUS;

    Map<IFile, Long> oldTimeStamps = createModificationStampMap(readOnlyFiles);
    IStatus status = ResourcesPlugin.getWorkspace().validateEdit(
        readOnlyFiles.toArray(new IFile[readOnlyFiles.size()]), context);
    if (!status.isOK()) return status;

    IStatus modified = null;
    Map<IFile, Long> newTimeStamps = createModificationStampMap(readOnlyFiles);
    for (Iterator<IFile> iter = oldTimeStamps.keySet().iterator(); iter.hasNext();) {
      IFile file = iter.next();
      if (!oldTimeStamps.get(file).equals(newTimeStamps.get(file))) modified = addModified(modified, file);
    }
    if (modified != null) return modified;
    return Status.OK_STATUS;
  }

  private static IStatus addModified(IStatus status, IFile file) {
    IStatus entry = new Status(IStatus.ERROR, ID_PLUGIN, 10003, "FILE MODIFIED", null);
    if (status == null) {
      return entry;
    }
    else if (status.isMultiStatus()) {
      ((MultiStatus) status).add(entry);
      return status;
    }
    else {
      MultiStatus result = new MultiStatus(ID_PLUGIN, 10003, "FILE MODIFIED", null);
      result.add(status);
      result.add(entry);
      return result;
    }
  }

  /**
   * Checks if the given project or workspace has source compliance 1.5 or greater.
   * 
   * @param project
   *          the project to test or <code>null</code> to test the workspace settings
   * @return <code>true</code> if the given project or workspace has source compliance 1.5 or greater.
   */
  public static boolean is50OrHigher(IJavaProject project) {
    String source = project != null ? project.getOption(JavaCore.COMPILER_SOURCE, true) : JavaCore.getOption(JavaCore.COMPILER_SOURCE);
    return is50OrHigher(source);
  }

  public static boolean is50OrHigher(String compliance) {
    return !isVersionLessThan(compliance, JavaCore.VERSION_1_5);
  }

  /**
   * @param version1
   *          the first version
   * @param version2
   *          the second version
   * @return <code>true</code> iff version1 is less than version2
   */
  public static boolean isVersionLessThan(String version1, String version2) {
    if (JavaCore.VERSION_CLDC_1_1.equals(version1)) {
      version1 = JavaCore.VERSION_1_1 + 'a';
    }
    if (JavaCore.VERSION_CLDC_1_1.equals(version2)) {
      version2 = JavaCore.VERSION_1_1 + 'a';
    }
    return version1.compareTo(version2) < 0;
  }

  public static boolean isReadOnly(IResource resource) {
    ResourceAttributes resourceAttributes = resource.getResourceAttributes();
    if (resourceAttributes == null) // not supported on this platform for this resource
    return false;
    return resourceAttributes.isReadOnly();
  }

  private static Map<IFile, Long> createModificationStampMap(List<IResource> files) {
    Map<IFile, Long> map = new HashMap<IFile, Long>();
    for (Iterator<IResource> iter = files.iterator(); iter.hasNext();) {
      IFile file = (IFile) iter.next();
      map.put(file, new Long(file.getModificationStamp()));
    }
    return map;
  }

  private static ImportRewrite configureImportRewrite(ImportRewrite rewrite) {
//    IJavaProject project = rewrite.getCompilationUnit().getJavaProject();
//    String order = getPreference(ORGIMPORTS_IMPORTORDER, project);
//    if (order.endsWith(";")) { //$NON-NLS-1$
//      order = order.substring(0, order.length() - 1);
//    }
//    String[] split = SEMICOLON_PATTERN.split(order, -1);
//    rewrite.setImportOrder(split);
//
//    String thres = getPreference(ORGIMPORTS_ONDEMANDTHRESHOLD, project);
//    try {
//      int num = Integer.parseInt(thres);
//      if (num == 0) num = 1;
//      rewrite.setOnDemandImportThreshold(num);
//    }
//    catch (NumberFormatException e) {
//      // ignore
//    }
//    String thresStatic = getPreference(ORGIMPORTS_STATIC_ONDEMANDTHRESHOLD, project);
//    try {
//      int num = Integer.parseInt(thresStatic);
//      if (num == 0) num = 1;
//      rewrite.setStaticOnDemandImportThreshold(num);
//    }
//    catch (NumberFormatException e) {
//      // ignore
//    }

    rewrite.setImportOrder(new String[]{"java", "javax", "org", "com"});
    rewrite.setOnDemandImportThreshold(99);
    rewrite.setStaticOnDemandImportThreshold(99);

    return rewrite;
  }

  private static int internalGetPossibleTypeKinds(ASTNode node) {
    int kind = ALL_TYPES;

    int mask = ALL_TYPES | VOIDTYPE;

    ASTNode parent = node.getParent();
    while (parent instanceof QualifiedName) {
      if (node.getLocationInParent() == QualifiedName.QUALIFIER_PROPERTY) {
        return REF_TYPES;
      }
      node = parent;
      parent = parent.getParent();
      mask = REF_TYPES;
    }
    while (parent instanceof Type) {
      if (parent instanceof QualifiedType) {
        if (node.getLocationInParent() == QualifiedType.QUALIFIER_PROPERTY) {
          return mask & (REF_TYPES);
        }
        mask &= REF_TYPES;
      }
      else if (parent instanceof ParameterizedType) {
        if (node.getLocationInParent() == ParameterizedType.TYPE_ARGUMENTS_PROPERTY) {
          return mask & REF_TYPES_AND_VAR;
        }
        mask &= CLASSES | INTERFACES;
      }
      else if (parent instanceof WildcardType) {
        if (node.getLocationInParent() == WildcardType.BOUND_PROPERTY) {
          return mask & REF_TYPES_AND_VAR;
        }
      }
      node = parent;
      parent = parent.getParent();
    }

    switch (parent.getNodeType()) {
      case ASTNode.TYPE_DECLARATION:
        if (node.getLocationInParent() == TypeDeclaration.SUPER_INTERFACE_TYPES_PROPERTY) {
          kind = INTERFACES;
        }
        else if (node.getLocationInParent() == TypeDeclaration.SUPERCLASS_TYPE_PROPERTY) {
          kind = CLASSES;
        }
        break;
      case ASTNode.ENUM_DECLARATION:
        kind = INTERFACES;
        break;
      case ASTNode.METHOD_DECLARATION:
        if (node.getLocationInParent() == MethodDeclaration.THROWN_EXCEPTIONS_PROPERTY) {
          kind = CLASSES;
        }
        else if (node.getLocationInParent() == MethodDeclaration.RETURN_TYPE2_PROPERTY) {
          kind = ALL_TYPES | VOIDTYPE;
        }
        break;
      case ASTNode.ANNOTATION_TYPE_MEMBER_DECLARATION:
        kind = PRIMITIVETYPES | ANNOTATIONS | ENUMS;
        break;
      case ASTNode.INSTANCEOF_EXPRESSION:
        kind = REF_TYPES;
        break;
      case ASTNode.THROW_STATEMENT:
        kind = CLASSES;
        break;
      case ASTNode.CLASS_INSTANCE_CREATION:
        if (((ClassInstanceCreation) parent).getAnonymousClassDeclaration() == null) {
          kind = CLASSES;
        }
        else {
          kind = CLASSES | INTERFACES;
        }
        break;
      case ASTNode.SINGLE_VARIABLE_DECLARATION:
        int superParent = parent.getParent().getNodeType();
        if (superParent == ASTNode.CATCH_CLAUSE) {
          kind = CLASSES;
        }
        break;
      case ASTNode.TAG_ELEMENT:
        kind = REF_TYPES;
        break;
      case ASTNode.MARKER_ANNOTATION:
      case ASTNode.SINGLE_MEMBER_ANNOTATION:
      case ASTNode.NORMAL_ANNOTATION:
        kind = ANNOTATIONS;
        break;
      case ASTNode.TYPE_PARAMETER:
        if (((TypeParameter) parent).typeBounds().indexOf(node) > 0) {
          kind = INTERFACES;
        }
        else {
          kind = REF_TYPES_AND_VAR;
        }
        break;
      case ASTNode.TYPE_LITERAL:
        kind = REF_TYPES;
        break;
      default:
    }
    return kind & mask;
  }
}
