/**
 */
package org.eclipse.scout.saml.saml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Logic Type Attribute List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.scout.saml.saml.SamlPackage#getLogicTypeAttributeList()
 * @model
 * @generated
 */
public enum LogicTypeAttributeList implements Enumerator
{
  /**
   * The '<em><b>Global</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GLOBAL_VALUE
   * @generated
   * @ordered
   */
  GLOBAL(0, "global", "global"),

  /**
   * The '<em><b>All</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ALL_VALUE
   * @generated
   * @ordered
   */
  ALL(1, "all", "all"),

  /**
   * The '<em><b>Modify load</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODIFY_LOAD_VALUE
   * @generated
   * @ordered
   */
  MODIFY_LOAD(2, "modify_load", "modify_load"),

  /**
   * The '<em><b>Modify store</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MODIFY_STORE_VALUE
   * @generated
   * @ordered
   */
  MODIFY_STORE(3, "modify_store", "modify_store"),

  /**
   * The '<em><b>New load</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEW_LOAD_VALUE
   * @generated
   * @ordered
   */
  NEW_LOAD(4, "new_load", "new_load"),

  /**
   * The '<em><b>New store</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEW_STORE_VALUE
   * @generated
   * @ordered
   */
  NEW_STORE(5, "new_store", "new_store"),

  /**
   * The '<em><b>Changed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANGED_VALUE
   * @generated
   * @ordered
   */
  CHANGED(6, "changed", "changed"),

  /**
   * The '<em><b>Click</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLICK_VALUE
   * @generated
   * @ordered
   */
  CLICK(7, "click", "click"),

  /**
   * The '<em><b>Master changed</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MASTER_CHANGED_VALUE
   * @generated
   * @ordered
   */
  MASTER_CHANGED(8, "master_changed", "master_changed"),

  /**
   * The '<em><b>Init</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INIT_VALUE
   * @generated
   * @ordered
   */
  INIT(9, "init", "init");

  /**
   * The '<em><b>Global</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Global</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GLOBAL
   * @model name="global"
   * @generated
   * @ordered
   */
  public static final int GLOBAL_VALUE = 0;

  /**
   * The '<em><b>All</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ALL
   * @model name="all"
   * @generated
   * @ordered
   */
  public static final int ALL_VALUE = 1;

  /**
   * The '<em><b>Modify load</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Modify load</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODIFY_LOAD
   * @model name="modify_load"
   * @generated
   * @ordered
   */
  public static final int MODIFY_LOAD_VALUE = 2;

  /**
   * The '<em><b>Modify store</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Modify store</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MODIFY_STORE
   * @model name="modify_store"
   * @generated
   * @ordered
   */
  public static final int MODIFY_STORE_VALUE = 3;

  /**
   * The '<em><b>New load</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>New load</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEW_LOAD
   * @model name="new_load"
   * @generated
   * @ordered
   */
  public static final int NEW_LOAD_VALUE = 4;

  /**
   * The '<em><b>New store</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>New store</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEW_STORE
   * @model name="new_store"
   * @generated
   * @ordered
   */
  public static final int NEW_STORE_VALUE = 5;

  /**
   * The '<em><b>Changed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Changed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHANGED
   * @model name="changed"
   * @generated
   * @ordered
   */
  public static final int CHANGED_VALUE = 6;

  /**
   * The '<em><b>Click</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Click</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLICK
   * @model name="click"
   * @generated
   * @ordered
   */
  public static final int CLICK_VALUE = 7;

  /**
   * The '<em><b>Master changed</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Master changed</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MASTER_CHANGED
   * @model name="master_changed"
   * @generated
   * @ordered
   */
  public static final int MASTER_CHANGED_VALUE = 8;

  /**
   * The '<em><b>Init</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Init</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INIT
   * @model name="init"
   * @generated
   * @ordered
   */
  public static final int INIT_VALUE = 9;

  /**
   * An array of all the '<em><b>Logic Type Attribute List</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LogicTypeAttributeList[] VALUES_ARRAY =
    new LogicTypeAttributeList[]
    {
      GLOBAL,
      ALL,
      MODIFY_LOAD,
      MODIFY_STORE,
      NEW_LOAD,
      NEW_STORE,
      CHANGED,
      CLICK,
      MASTER_CHANGED,
      INIT,
    };

  /**
   * A public read-only list of all the '<em><b>Logic Type Attribute List</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LogicTypeAttributeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Logic Type Attribute List</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicTypeAttributeList get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogicTypeAttributeList result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Logic Type Attribute List</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicTypeAttributeList getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogicTypeAttributeList result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Logic Type Attribute List</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogicTypeAttributeList get(int value)
  {
    switch (value)
    {
      case GLOBAL_VALUE: return GLOBAL;
      case ALL_VALUE: return ALL;
      case MODIFY_LOAD_VALUE: return MODIFY_LOAD;
      case MODIFY_STORE_VALUE: return MODIFY_STORE;
      case NEW_LOAD_VALUE: return NEW_LOAD;
      case NEW_STORE_VALUE: return NEW_STORE;
      case CHANGED_VALUE: return CHANGED;
      case CLICK_VALUE: return CLICK;
      case MASTER_CHANGED_VALUE: return MASTER_CHANGED;
      case INIT_VALUE: return INIT;
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
  private LogicTypeAttributeList(int value, String name, String literal)
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
  
} //LogicTypeAttributeList
