/**
 */
package org.eclipse.scout.saml.saml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Java Run At Attribute List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlPackage#getJavaRunAtAttributeList()
 * @model
 * @generated
 */
public enum JavaRunAtAttributeList implements Enumerator
{
  /**
   * The '<em><b>Client</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLIENT_VALUE
   * @generated
   * @ordered
   */
  CLIENT(0, "client", "client"),

  /**
   * The '<em><b>Server</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SERVER_VALUE
   * @generated
   * @ordered
   */
  SERVER(1, "server", "server");

  /**
   * The '<em><b>Client</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Client</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLIENT
   * @model name="client"
   * @generated
   * @ordered
   */
  public static final int CLIENT_VALUE = 0;

  /**
   * The '<em><b>Server</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Server</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SERVER
   * @model name="server"
   * @generated
   * @ordered
   */
  public static final int SERVER_VALUE = 1;

  /**
   * An array of all the '<em><b>Java Run At Attribute List</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JavaRunAtAttributeList[] VALUES_ARRAY =
    new JavaRunAtAttributeList[]
    {
      CLIENT,
      SERVER,
    };

  /**
   * A public read-only list of all the '<em><b>Java Run At Attribute List</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JavaRunAtAttributeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Java Run At Attribute List</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaRunAtAttributeList get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JavaRunAtAttributeList result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Java Run At Attribute List</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaRunAtAttributeList getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JavaRunAtAttributeList result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Java Run At Attribute List</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JavaRunAtAttributeList get(int value)
  {
    switch (value)
    {
      case CLIENT_VALUE: return CLIENT;
      case SERVER_VALUE: return SERVER;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private JavaRunAtAttributeList(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //JavaRunAtAttributeList
