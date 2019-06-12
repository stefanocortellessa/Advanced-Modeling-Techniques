/**
 */
package UniverityU.uncertainty;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UData</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.uncertainty.UData#getName <em>Name</em>}</li>
 *   <li>{@link UniverityU.uncertainty.UData#getUtype <em>Utype</em>}</li>
 * </ul>
 *
 * @see UniverityU.uncertainty.UncertaintyPackage#getUData()
 * @model abstract="true"
 * @generated
 */
public interface UData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UniverityU.uncertainty.UncertaintyPackage#getUData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UniverityU.uncertainty.UData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Utype</b></em>' attribute.
	 * The literals are from the enumeration {@link UniverityU.uncertainty.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utype</em>' attribute.
	 * @see UniverityU.uncertainty.OperatorType
	 * @see #setUtype(OperatorType)
	 * @see UniverityU.uncertainty.UncertaintyPackage#getUData_Utype()
	 * @model
	 * @generated
	 */
	OperatorType getUtype();

	/**
	 * Sets the value of the '{@link UniverityU.uncertainty.UData#getUtype <em>Utype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utype</em>' attribute.
	 * @see UniverityU.uncertainty.OperatorType
	 * @see #getUtype()
	 * @generated
	 */
	void setUtype(OperatorType value);

} // UData
