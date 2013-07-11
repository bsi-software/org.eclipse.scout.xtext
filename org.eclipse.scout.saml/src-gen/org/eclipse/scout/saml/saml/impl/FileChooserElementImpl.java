/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.scout.saml.saml.FileChooserElement;
import org.eclipse.scout.saml.saml.SamlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Chooser Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getMaxlen <em>Maxlen</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getDefaultDirectory <em>Default Directory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getShowDirectory <em>Show Directory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getShowFileName <em>Show File Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.impl.FileChooserElementImpl#getShowFileExtension <em>Show File Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileChooserElementImpl extends ValueFieldElementImpl implements FileChooserElement
{
  /**
   * The default value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected static final int MAXLEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaxlen() <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxlen()
   * @generated
   * @ordered
   */
  protected int maxlen = MAXLEN_EDEFAULT;

  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final String MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected String mode = MODE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getExtensions() <em>Extensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected static final String EXTENSIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtensions()
   * @generated
   * @ordered
   */
  protected String extensions = EXTENSIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getDefaultDirectory() <em>Default Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultDirectory()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_DIRECTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultDirectory() <em>Default Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultDirectory()
   * @generated
   * @ordered
   */
  protected String defaultDirectory = DEFAULT_DIRECTORY_EDEFAULT;

  /**
   * The default value of the '{@link #getShowDirectory() <em>Show Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowDirectory()
   * @generated
   * @ordered
   */
  protected static final String SHOW_DIRECTORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShowDirectory() <em>Show Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowDirectory()
   * @generated
   * @ordered
   */
  protected String showDirectory = SHOW_DIRECTORY_EDEFAULT;

  /**
   * The default value of the '{@link #getShowFileName() <em>Show File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowFileName()
   * @generated
   * @ordered
   */
  protected static final String SHOW_FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShowFileName() <em>Show File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowFileName()
   * @generated
   * @ordered
   */
  protected String showFileName = SHOW_FILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getShowFileExtension() <em>Show File Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowFileExtension()
   * @generated
   * @ordered
   */
  protected static final String SHOW_FILE_EXTENSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShowFileExtension() <em>Show File Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShowFileExtension()
   * @generated
   * @ordered
   */
  protected String showFileExtension = SHOW_FILE_EXTENSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileChooserElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SamlPackage.Literals.FILE_CHOOSER_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMaxlen()
  {
    return maxlen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxlen(int newMaxlen)
  {
    int oldMaxlen = maxlen;
    maxlen = newMaxlen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN, oldMaxlen, maxlen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(String newMode)
  {
    String oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtensions()
  {
    return extensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtensions(String newExtensions)
  {
    String oldExtensions = extensions;
    extensions = newExtensions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS, oldExtensions, extensions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultDirectory()
  {
    return defaultDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultDirectory(String newDefaultDirectory)
  {
    String oldDefaultDirectory = defaultDirectory;
    defaultDirectory = newDefaultDirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY, oldDefaultDirectory, defaultDirectory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShowDirectory()
  {
    return showDirectory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowDirectory(String newShowDirectory)
  {
    String oldShowDirectory = showDirectory;
    showDirectory = newShowDirectory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY, oldShowDirectory, showDirectory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShowFileName()
  {
    return showFileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowFileName(String newShowFileName)
  {
    String oldShowFileName = showFileName;
    showFileName = newShowFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME, oldShowFileName, showFileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShowFileExtension()
  {
    return showFileExtension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShowFileExtension(String newShowFileExtension)
  {
    String oldShowFileExtension = showFileExtension;
    showFileExtension = newShowFileExtension;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION, oldShowFileExtension, showFileExtension));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN:
        return getMaxlen();
      case SamlPackage.FILE_CHOOSER_ELEMENT__MODE:
        return getMode();
      case SamlPackage.FILE_CHOOSER_ELEMENT__TYPE:
        return getType();
      case SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS:
        return getExtensions();
      case SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY:
        return getDefaultDirectory();
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY:
        return getShowDirectory();
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME:
        return getShowFileName();
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION:
        return getShowFileExtension();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN:
        setMaxlen((Integer)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__MODE:
        setMode((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__TYPE:
        setType((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS:
        setExtensions((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY:
        setDefaultDirectory((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY:
        setShowDirectory((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME:
        setShowFileName((String)newValue);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION:
        setShowFileExtension((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN:
        setMaxlen(MAXLEN_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS:
        setExtensions(EXTENSIONS_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY:
        setDefaultDirectory(DEFAULT_DIRECTORY_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY:
        setShowDirectory(SHOW_DIRECTORY_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME:
        setShowFileName(SHOW_FILE_NAME_EDEFAULT);
        return;
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION:
        setShowFileExtension(SHOW_FILE_EXTENSION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN:
        return maxlen != MAXLEN_EDEFAULT;
      case SamlPackage.FILE_CHOOSER_ELEMENT__MODE:
        return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
      case SamlPackage.FILE_CHOOSER_ELEMENT__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS:
        return EXTENSIONS_EDEFAULT == null ? extensions != null : !EXTENSIONS_EDEFAULT.equals(extensions);
      case SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY:
        return DEFAULT_DIRECTORY_EDEFAULT == null ? defaultDirectory != null : !DEFAULT_DIRECTORY_EDEFAULT.equals(defaultDirectory);
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY:
        return SHOW_DIRECTORY_EDEFAULT == null ? showDirectory != null : !SHOW_DIRECTORY_EDEFAULT.equals(showDirectory);
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME:
        return SHOW_FILE_NAME_EDEFAULT == null ? showFileName != null : !SHOW_FILE_NAME_EDEFAULT.equals(showFileName);
      case SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION:
        return SHOW_FILE_EXTENSION_EDEFAULT == null ? showFileExtension != null : !SHOW_FILE_EXTENSION_EDEFAULT.equals(showFileExtension);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (maxlen: ");
    result.append(maxlen);
    result.append(", mode: ");
    result.append(mode);
    result.append(", type: ");
    result.append(type);
    result.append(", extensions: ");
    result.append(extensions);
    result.append(", defaultDirectory: ");
    result.append(defaultDirectory);
    result.append(", showDirectory: ");
    result.append(showDirectory);
    result.append(", showFileName: ");
    result.append(showFileName);
    result.append(", showFileExtension: ");
    result.append(showFileExtension);
    result.append(')');
    return result.toString();
  }

} //FileChooserElementImpl
