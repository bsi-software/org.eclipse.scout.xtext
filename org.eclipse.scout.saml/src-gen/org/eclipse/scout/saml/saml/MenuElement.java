/**
 */
package org.eclipse.scout.saml.saml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getSingleSelect <em>Single Select</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getMultiSelect <em>Multi Select</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getEmptySelect <em>Empty Select</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getLogic <em>Logic</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.MenuElement#getMenus <em>Menus</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement()
 * @model
 * @generated
 */
public interface MenuElement extends EObject
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #setEnabled(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Enabled()
   * @model
   * @generated
   */
  String getEnabled();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(String value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Visible()
   * @model
   * @generated
   */
  String getVisible();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #getVisible()
   * @generated
   */
  void setVisible(String value);

  /**
   * Returns the value of the '<em><b>Single Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Select</em>' attribute.
   * @see #setSingleSelect(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_SingleSelect()
   * @model
   * @generated
   */
  String getSingleSelect();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getSingleSelect <em>Single Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Select</em>' attribute.
   * @see #getSingleSelect()
   * @generated
   */
  void setSingleSelect(String value);

  /**
   * Returns the value of the '<em><b>Multi Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi Select</em>' attribute.
   * @see #setMultiSelect(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_MultiSelect()
   * @model
   * @generated
   */
  String getMultiSelect();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getMultiSelect <em>Multi Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multi Select</em>' attribute.
   * @see #getMultiSelect()
   * @generated
   */
  void setMultiSelect(String value);

  /**
   * Returns the value of the '<em><b>Empty Select</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Select</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Select</em>' attribute.
   * @see #setEmptySelect(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_EmptySelect()
   * @model
   * @generated
   */
  String getEmptySelect();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getEmptySelect <em>Empty Select</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Select</em>' attribute.
   * @see #getEmptySelect()
   * @generated
   */
  void setEmptySelect(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Text()
   * @model
   * @generated
   */
  TranslationElement getText();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getText <em>Text</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' reference.
   * @see #getText()
   * @generated
   */
  void setText(TranslationElement value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_SuperType()
   * @model
   * @generated
   */
  TemplateElement getSuperType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.MenuElement#getSuperType <em>Super Type</em>}' reference.
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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Logic()
   * @model containment="true"
   * @generated
   */
  EList<LogicElement> getLogic();

  /**
   * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.scout.saml.saml.MenuElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menus</em>' containment reference list.
   * @see org.eclipse.scout.saml.saml.SamlPackage#getMenuElement_Menus()
   * @model containment="true"
   * @generated
   */
  EList<MenuElement> getMenus();

} // MenuElement
