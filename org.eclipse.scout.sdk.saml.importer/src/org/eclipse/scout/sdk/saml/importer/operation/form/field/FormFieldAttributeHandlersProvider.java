/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation.form.field;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.BigDecimalElement;
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.CompositeFieldElement;
import org.eclipse.scout.saml.saml.CustomFieldElement;
import org.eclipse.scout.saml.saml.FileChooserElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.saml.saml.ListBoxElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.RadioButtonElement;
import org.eclipse.scout.saml.saml.RadioGroupElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TabBoxElement;
import org.eclipse.scout.saml.saml.TabElement;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;

/**
 * <h3>{@link FormFieldAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 01.02.2013
 */
public class FormFieldAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  protected final static int HORIZONTAL_ALIGN_LEFT = -1;
  protected final static int HORIZONTAL_ALIGN_CENTER = 0;
  protected final static int HORIZONTAL_ALIGN_RIGHT = 1;

  private final static Pattern REGEX_EXTENSIONS_REPLACE = Pattern.compile("\\.|\\*\\.");

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__FIELDS),
      @SamlAttribute(elementType = CompositeFieldElement.class, featureId = SamlPackage.COMPOSITE_FIELD_ELEMENT__FIELDS),
      @SamlAttribute(elementType = CustomFieldElement.class, featureId = SamlPackage.CUSTOM_FIELD_ELEMENT__FIELDS)
  })
  public void dispatchFieldElements(List<FormFieldElement> fields) throws CoreException {
    dispatchFields(fields);
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = TabBoxElement.class, featureId = SamlPackage.TAB_BOX_ELEMENT__TABS)})
  public void dispatchTabElements(List<TabElement> tabs) throws CoreException {
    dispatchFields(tabs);
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = RadioGroupElement.class, featureId = SamlPackage.RADIO_GROUP_ELEMENT__OPTIONS)})
  public void dispatchRadioOptionElements(List<RadioButtonElement> options) throws CoreException {
    dispatchFields(options);
  }

  private void dispatchFields(List<?> fields) throws CoreException {
    // no heap polution as we are only iterating
    double order = 10.0;
    for (Object field : fields) {
      IOperation op = ElementImportersExtension.getImporterFor(field, getSamlContext(), order);
      op.validate();
      op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      order += 10.0;
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = SequenceBoxElement.class, featureId = SamlPackage.SEQUENCE_BOX_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = CustomFieldElement.class, featureId = SamlPackage.CUSTOM_FIELD_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__WIDTH_IN_PIXELS),
      @SamlAttribute(elementType = TabBoxElement.class, featureId = SamlPackage.TAB_BOX_ELEMENT__WIDTH_IN_PIXELS)
  })
  public void applyWidthInPixelsAttribute(int widthInPixels) throws CoreException, IllegalArgumentException {
    if (widthInPixels > 0) {
      overrideMethod("getConfiguredWidthInPixel", "return " + widthInPixels + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__MASTER)})
  public void applyMasterAttribute(ValueFieldElement masterField) throws CoreException, IllegalArgumentException {
    if (masterField != null && masterField.getName() != null) {

      FormFieldElementImportOperation imp = (FormFieldElementImportOperation) ElementImportersExtension.getImporterFor(masterField, getSamlContext());
      String fieldNameSuffix = imp.getFieldSuffix();

      if (fieldNameSuffix != null) {
        String masterFieldName = masterField.getName() + fieldNameSuffix;
        overrideMethod("getConfiguredMasterField", "return " + masterFieldName + ".class;");
        overrideMethod("getConfiguredMasterRequired", "return true;");
      }
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = StringElement.class, featureId = SamlPackage.STRING_ELEMENT__HORIZONTAL_ALIGN)})
  public void applyHorizontalTextAlignAttribute(String align) throws CoreException, IllegalArgumentException {
    applyHorizontalAlignAttribute(align, HORIZONTAL_ALIGN_LEFT);
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__HORIZONTAL_ALIGN),
      @SamlAttribute(elementType = LongElement.class, featureId = SamlPackage.LONG_ELEMENT__HORIZONTAL_ALIGN)
  })
  public void applyHorizontalNumberAlignAttribute(String align) throws CoreException, IllegalArgumentException {
    applyHorizontalAlignAttribute(align, HORIZONTAL_ALIGN_RIGHT);
  }

  private void applyHorizontalAlignAttribute(String align, int defaultVal) throws CoreException, IllegalArgumentException {
    if (align != null) {
      int alignValue = getHorizontalAlignValue(align);
      if (alignValue != defaultVal) {
        overrideMethod("getConfiguredHorizontalAlignment", "return " + alignValue + ";");
      }
    }
  }

  private int getHorizontalAlignValue(String align) {
    if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getLeftKeyword_0().getValue())) {
      return HORIZONTAL_ALIGN_LEFT;
    }
    else if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getCenterKeyword_1().getValue())) {
      return HORIZONTAL_ALIGN_CENTER;
    }
    else if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getRightKeyword_2().getValue())) {
      return HORIZONTAL_ALIGN_RIGHT;
    }
    else {
      throw new IllegalArgumentException("unknown border_decoration: " + align);
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = SmartfieldElement.class, featureId = SamlPackage.SMARTFIELD_ELEMENT__CODE),
      @SamlAttribute(elementType = ListBoxElement.class, featureId = SamlPackage.LIST_BOX_ELEMENT__CODE)
  })
  public void applyCodeAttribute(CodeElement a) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      overrideMethod("getConfiguredCodeType", "return " + a.getName() + SdkProperties.SUFFIX_CODE_TYPE + ".class;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__PROCESS_BUTTON)})
  public void applyProcessButtonAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredProcessButton", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = SmartfieldElement.class, featureId = SamlPackage.SMARTFIELD_ELEMENT__LOOKUP),
      @SamlAttribute(elementType = ListBoxElement.class, featureId = SamlPackage.LIST_BOX_ELEMENT__LOOKUP)
  })
  public void applyLookupAttribute(LookupElement a) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      overrideMethod("getConfiguredLookupCall", "return " + a.getName() + SdkProperties.SUFFIX_LOOKUP_CALL + ".class;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__MAX)})
  public void applyDecimalMaxAttribute(String max) throws CoreException, IllegalArgumentException {
    Double maxVal = parseDouble(max);
    if (maxVal != null) {
      overrideMethod("getConfiguredMaxValue", "return " + maxVal + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__MIN)})
  public void applyDecimalMinAttribute(String min) throws CoreException, IllegalArgumentException {
    Double minVal = parseDouble(min);
    if (minVal != null) {
      overrideMethod("getConfiguredMinValue", "return " + minVal + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = LongElement.class, featureId = SamlPackage.LONG_ELEMENT__MAX)})
  public void applyLongMaxAttribute(int max) throws CoreException, IllegalArgumentException {
    overrideMethod("getConfiguredMaximumValue", "return " + max + "L;");
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = LongElement.class, featureId = SamlPackage.LONG_ELEMENT__MIN)})
  public void applyLongMinAttribute(int min) throws CoreException, IllegalArgumentException {
    overrideMethod("getConfiguredMinimumValue", "return " + min + "L;");
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__PERCENT)})
  public void applyPercentAttribute(String percent) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getTrueKeyword_0().getValue().equals(percent)) {
      overrideMethod("getConfiguredPercent", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__FRACTION_DIGITS)})
  public void applyFractionDigitsAttribute(int digits) throws CoreException, IllegalArgumentException {
    if (digits > 0 && digits != 2) {
      overrideMethod("getConfiguredFractionDigits", "return " + digits + ";");
      overrideMethod("getConfiguredMaxFractionDigits", "return " + digits + ";");
      overrideMethod("getConfiguredMinFractionDigits", "return 0;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = BigDecimalElement.class, featureId = SamlPackage.BIG_DECIMAL_ELEMENT__GROUPING)})
  public void applyGroupingAttribute(String grouping) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(grouping)) {
      overrideMethod("getConfiguredGroupingUsed", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = CompositeFieldElement.class, featureId = SamlPackage.COMPOSITE_FIELD_ELEMENT__TEXT),
      @SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__TEXT),
      @SamlAttribute(elementType = CustomFieldElement.class, featureId = SamlPackage.CUSTOM_FIELD_ELEMENT__TEXT),
      @SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__TEXT),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__TEXT),
      @SamlAttribute(elementType = RadioButtonElement.class, featureId = SamlPackage.RADIO_BUTTON_ELEMENT__TEXT)
  })
  public void applyTextAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredLabel", getNlsReturnClause(a));
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = SequenceBoxElement.class, featureId = SamlPackage.SEQUENCE_BOX_ELEMENT__LABEL_VISIBLE),
      @SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__LABEL_VISIBLE),
      @SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__LABEL_VISIBLE),
      @SamlAttribute(elementType = CustomFieldElement.class, featureId = SamlPackage.CUSTOM_FIELD_ELEMENT__LABEL_VISIBLE),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__LABEL_VISIBLE)
  })
  public void applyLabelVisibleAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredLabelVisible", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__GRID_HEIGHT),
      @SamlAttribute(elementType = ListBoxElement.class, featureId = SamlPackage.LIST_BOX_ELEMENT__GRID_HEIGHT),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__GRID_HEIGHT)
  })
  public void applyGridHeightAttribute(int height) throws CoreException, IllegalArgumentException {
    if (height > 1) {
      overrideMethod("getConfiguredGridH", "return " + height + ";");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__COLUMNS),
      @SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__COLUMNS),
      @SamlAttribute(elementType = TabElement.class, featureId = SamlPackage.TAB_ELEMENT__COLUMNS)
  })
  public void applyColumnsAttribute(int columns) throws IllegalArgumentException, CoreException {
    if (columns > 0) {
      overrideMethod("getConfiguredGridColumnCount", "return " + columns + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = StringElement.class, featureId = SamlPackage.STRING_ELEMENT__GRID_HEIGHT)})
  public void applyStringGridHeightAttribute(int height) throws CoreException, IllegalArgumentException {
    applyGridHeightAttribute(height);
    if (height > 1) {
      overrideMethod("getConfiguredMultilineText", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = SequenceBoxElement.class, featureId = SamlPackage.SEQUENCE_BOX_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = CustomFieldElement.class, featureId = SamlPackage.CUSTOM_FIELD_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__GRID_WIDTH),
      @SamlAttribute(elementType = TabBoxElement.class, featureId = SamlPackage.TAB_BOX_ELEMENT__GRID_WIDTH)
  })
  public void applyGridWidthAttribute(int width) throws CoreException, IllegalArgumentException {
    if (width > 0) {
      overrideMethod("getConfiguredGridW", "return " + width + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ValueFieldElement.class, featureId = SamlPackage.VALUE_FIELD_ELEMENT__MANDATORY)})
  public void applyMandatoryAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getTrueKeyword_0().getValue().equals(a)) {
      overrideMethod("getConfiguredMandatory", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__BORDER_VISIBLE)})
  public void applyBorderVisibleAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredBorderVisible", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = GroupBoxElement.class, featureId = SamlPackage.GROUP_BOX_ELEMENT__BORDER_DECORATION)})
  public void applyBorderDecorationAttribute(String a) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(a)) {
      String constant = getBorderConstant(a);
      if (constant != null) {
        overrideMethod("getConfiguredBorderDecoration", "return " + constant + ";");
      }
    }
  }

  private String getBorderConstant(String val) throws IllegalArgumentException {
    if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationEmptyKeyword_2_6_2_0_0().getValue())) {
      return "BORDER_DECORATION_EMPTY";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationAutoKeyword_2_6_2_0_3().getValue())) {
      return null;// default, meaning: "BORDER_DECORATION_AUTO"
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationLineKeyword_2_6_2_0_1().getValue())) {
      return "BORDER_DECORATION_LINE";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationSectionKeyword_2_6_2_0_2().getValue())) {
      return "BORDER_DECORATION_SECTION";
    }
    else {
      throw new IllegalArgumentException("unknown border_decoration: " + val);
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = FormFieldElement.class, featureId = SamlPackage.FORM_FIELD_ELEMENT__VISIBLE),
      @SamlAttribute(elementType = RadioButtonElement.class, featureId = SamlPackage.RADIO_BUTTON_ELEMENT__VISIBLE)
  })
  public void applyVisibleAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredVisible", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = FormFieldElement.class, featureId = SamlPackage.FORM_FIELD_ELEMENT__ENABLED),
      @SamlAttribute(elementType = RadioButtonElement.class, featureId = SamlPackage.RADIO_BUTTON_ELEMENT__ENABLED)
  })
  public void applyEnabledAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredEnabled", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = StringElement.class, featureId = SamlPackage.STRING_ELEMENT__MAXLEN),
      @SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__MAXLEN)
  })
  public void applyMaxLengthAttribute(int maxlen) throws CoreException, IllegalArgumentException {
    if (maxlen != 0 && maxlen != 4000) {
      overrideMethod("getConfiguredMaxLength", "return " + maxlen + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__TYPE)})
  public void applyButtonSystemTypeAttribute(String type) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(type)) {
      String constant = getButtonSystemTypeConstant(type);
      if (constant != null) {
        overrideMethod("getConfiguredSystemType", "return " + constant + ";");
      }
    }
  }

  private String getButtonSystemTypeConstant(String type) {
    if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeNormalKeyword_2_4_2_0_0().getValue())) {
      return null; // default: SYSTEM_TYPE_NONE
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeCancelKeyword_2_4_2_0_1().getValue())) {
      return "SYSTEM_TYPE_CANCEL";
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeCloseKeyword_2_4_2_0_2().getValue())) {
      return "SYSTEM_TYPE_CLOSE";
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeOkKeyword_2_4_2_0_3().getValue())) {
      return "SYSTEM_TYPE_OK";
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeResetKeyword_2_4_2_0_4().getValue())) {
      return "SYSTEM_TYPE_RESET";
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getButtonElementAccess().getTypeSaveKeyword_2_4_2_0_5().getValue())) {
      return "SYSTEM_TYPE_SAVE";
    }
    else {
      throw new IllegalArgumentException("unknown button system type: " + type);
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__MODE)})
  public void applyFileChooserModeAttribute(String mode) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(mode)) {
      if (mode.equals(getSamlContext().getGrammarAccess().getFileChooserElementAccess().getModeDirectoryKeyword_2_9_2_0_0().getValue())) {
        overrideMethod("getConfiguredFolderMode", "return true;");
      }
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__TYPE)})
  public void applyFileChooserTypeAttribute(String type) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(type)) {
      if (type.equals(getSamlContext().getGrammarAccess().getFileChooserElementAccess().getTypeLoadKeyword_2_10_2_0_0().getValue())) {
        overrideMethod("getConfiguredTypeLoad", "return true;");
      }
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__EXTENSIONS)})
  public void applyFileChooserExtensionsAttribute(String exts) throws CoreException, IllegalArgumentException {
    String[] extensions = parseExtensions(exts);
    if (extensions != null && extensions.length > 0) {
      StringBuilder out = new StringBuilder("return new String[]{");
      for (int i = 0; i < extensions.length; i++) {
        out.append(JdtUtility.toStringLiteral(extensions[i]));
        if (i < extensions.length - 1) {
          out.append(", ");
        }
      }
      out.append("};");
      overrideMethod("getConfiguredFileExtensions", out.toString());
    }
  }

  private static String[] parseExtensions(String exts) {
    if (!StringUtility.hasText(exts)) {
      return null;
    }

    exts = REGEX_EXTENSIONS_REPLACE.matcher(exts).replaceAll(" ");
    StringTokenizer tokenizer = new StringTokenizer(exts, ", ;\t", false);
    ArrayList<String> extensions = new ArrayList<String>();
    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();
      if (StringUtility.hasText(token)) {
        if ("*".equals(token)) {
          // all extensions -> no tokens needed
          return null;
        }
        extensions.add(token);
      }
    }

    return extensions.toArray(new String[extensions.size()]);
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__DEFAULT_DIRECTORY)})
  public void applyFileChooserDefaultDirAttribute(String dir) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(dir)) {
      overrideMethod("getConfiguredDirectory", "return " + JdtUtility.toStringLiteral(dir) + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_DIRECTORY)})
  public void applyFileChooserShowDirAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getTrueKeyword_0().getValue().equals(a)) {
      overrideMethod("getConfiguredShowDirectory", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME)})
  public void applyFileChooserShowNameAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredShowFileName", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FileChooserElement.class, featureId = SamlPackage.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION)})
  public void applyFileChooserShowExtAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredShowFileExtension", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = RadioButtonElement.class, featureId = SamlPackage.RADIO_BUTTON_ELEMENT__VALUE)})
  public void applyRadioButtonValueAttribute(String value) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(value)) {
      overrideMethod("getConfiguredRadioValue", "return " + value + ";");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = SequenceBoxElement.class, featureId = SamlPackage.SEQUENCE_BOX_ELEMENT__NAME)})
  public void applyAutoCheckFromToAttribute(String name) throws CoreException, IllegalArgumentException {
    overrideMethod("getConfiguredAutoCheckFromTo", "return false;");
  }
}
