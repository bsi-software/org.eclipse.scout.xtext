/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Field Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMaster <em>Master</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.ValueFieldElement#getWidthInPixels <em>Width In Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement()
 * @model
 * @generated
 */
public interface ValueFieldElement extends FormFieldElement
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' reference.
   * @see #setText(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Label Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Visible</em>' attribute.
   * @see #setLabelVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_LabelVisible()
   * @model
   * @generated
   */
  String getLabelVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getLabelVisible <em>Label Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Visible</em>' attribute.
   * @see #getLabelVisible()
   * @generated
   */
  void setLabelVisible(String value);

  /**
   * Returns the value of the '<em><b>Master</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' reference.
   * @see #setMaster(ValueFieldElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_Master()
   * @model
   * @generated
   */
  ValueFieldElement getMaster();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMaster <em>Master</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(ValueFieldElement value);

  /**
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_Mandatory()
   * @model
   * @generated
   */
  String getMandatory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #getMandatory()
   * @generated
   */
  void setMandatory(String value);

  /**
   * Returns the value of the '<em><b>Grid Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grid Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grid Width</em>' attribute.
   * @see #setGridWidth(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_GridWidth()
   * @model
   * @generated
   */
  int getGridWidth();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getGridWidth <em>Grid Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grid Width</em>' attribute.
   * @see #getGridWidth()
   * @generated
   */
  void setGridWidth(int value);

  /**
   * Returns the value of the '<em><b>Width In Pixels</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width In Pixels</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width In Pixels</em>' attribute.
   * @see #setWidthInPixels(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getValueFieldElement_WidthInPixels()
   * @model
   * @generated
   */
  int getWidthInPixels();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.ValueFieldElement#getWidthInPixels <em>Width In Pixels</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width In Pixels</em>' attribute.
   * @see #getWidthInPixels()
   * @generated
   */
  void setWidthInPixels(int value);

} // ValueFieldElement
