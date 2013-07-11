/**
 */
package org.eclipse.scout.saml.saml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Chooser Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getMaxlen <em>Maxlen</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getDefaultDirectory <em>Default Directory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowDirectory <em>Show Directory</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowFileName <em>Show File Name</em>}</li>
 *   <li>{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowFileExtension <em>Show File Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement()
 * @model
 * @generated
 */
public interface FileChooserElement extends ValueFieldElement
{
  /**
   * Returns the value of the '<em><b>Maxlen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maxlen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maxlen</em>' attribute.
   * @see #setMaxlen(int)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_Maxlen()
   * @model
   * @generated
   */
  int getMaxlen();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getMaxlen <em>Maxlen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Maxlen</em>' attribute.
   * @see #getMaxlen()
   * @generated
   */
  void setMaxlen(int value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(String value);

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
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Extensions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extensions</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extensions</em>' attribute.
   * @see #setExtensions(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_Extensions()
   * @model
   * @generated
   */
  String getExtensions();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getExtensions <em>Extensions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extensions</em>' attribute.
   * @see #getExtensions()
   * @generated
   */
  void setExtensions(String value);

  /**
   * Returns the value of the '<em><b>Default Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Directory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Directory</em>' attribute.
   * @see #setDefaultDirectory(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_DefaultDirectory()
   * @model
   * @generated
   */
  String getDefaultDirectory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getDefaultDirectory <em>Default Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Directory</em>' attribute.
   * @see #getDefaultDirectory()
   * @generated
   */
  void setDefaultDirectory(String value);

  /**
   * Returns the value of the '<em><b>Show Directory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show Directory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show Directory</em>' attribute.
   * @see #setShowDirectory(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_ShowDirectory()
   * @model
   * @generated
   */
  String getShowDirectory();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowDirectory <em>Show Directory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show Directory</em>' attribute.
   * @see #getShowDirectory()
   * @generated
   */
  void setShowDirectory(String value);

  /**
   * Returns the value of the '<em><b>Show File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show File Name</em>' attribute.
   * @see #setShowFileName(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_ShowFileName()
   * @model
   * @generated
   */
  String getShowFileName();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowFileName <em>Show File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show File Name</em>' attribute.
   * @see #getShowFileName()
   * @generated
   */
  void setShowFileName(String value);

  /**
   * Returns the value of the '<em><b>Show File Extension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Show File Extension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Show File Extension</em>' attribute.
   * @see #setShowFileExtension(String)
   * @see org.eclipse.scout.saml.saml.SamlPackage#getFileChooserElement_ShowFileExtension()
   * @model
   * @generated
   */
  String getShowFileExtension();

  /**
   * Sets the value of the '{@link org.eclipse.scout.saml.saml.FileChooserElement#getShowFileExtension <em>Show File Extension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Show File Extension</em>' attribute.
   * @see #getShowFileExtension()
   * @generated
   */
  void setShowFileExtension(String value);

} // FileChooserElement
