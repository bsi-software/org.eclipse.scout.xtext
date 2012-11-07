/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getFields <em>Fields</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FormElement#getKeyStrokes <em>Key Strokes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement()
 * @model
 * @generated
 */
public interface FormElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Modal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modal</em>' attribute.
   * @see #setModal(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Modal()
   * @model
   * @generated
   */
  String getModal();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getModal <em>Modal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modal</em>' attribute.
   * @see #getModal()
   * @generated
   */
  void setModal(String value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Columns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' attribute.
   * @see #setColumns(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Columns()
   * @model
   * @generated
   */
  int getColumns();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getColumns <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Columns</em>' attribute.
   * @see #getColumns()
   * @generated
   */
  void setColumns(int value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' reference.
   * @see #setTitle(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Title()
   * @model
   * @generated
   */
  TranslationElement getTitle();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getTitle <em>Title</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Subtitle</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtitle</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtitle</em>' reference.
   * @see #setSubtitle(TranslationElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Subtitle()
   * @model
   * @generated
   */
  TranslationElement getSubtitle();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getSubtitle <em>Subtitle</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtitle</em>' reference.
   * @see #getSubtitle()
   * @generated
   */
  void setSubtitle(TranslationElement value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(TemplateElement)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_SuperType()
   * @model
   * @generated
   */
  TemplateElement getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FormElement#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(TemplateElement value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.LogicElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.FormFieldElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FormFieldElement> getFields();

  /**
   * Returns the value of the '<em><b>Key Strokes</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.KeyElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Strokes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Strokes</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFormElement_KeyStrokes()
   * @model containment="true"
   * @generated
   */
  EList<KeyElement> getKeyStrokes();

} // FormElement
