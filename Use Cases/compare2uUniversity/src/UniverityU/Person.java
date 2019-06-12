/**
 */
package UniverityU;

import UniverityU.uncertainty.ModelElement;
import UniverityU.uncertainty.aPerson;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.Person#getName <em>Name</em>}</li>
 *   <li>{@link UniverityU.Person#getEmail <em>Email</em>}</li>
 *   <li>{@link UniverityU.Person#getRelatives <em>Relatives</em>}</li>
 * </ul>
 *
 * @see UniverityU.UniverityUPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends ModelElement, aPerson {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UniverityU.UniverityUPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UniverityU.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see UniverityU.UniverityUPackage#getPerson_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link UniverityU.Person#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Relatives</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relatives</em>' reference.
	 * @see #setRelatives(aPerson)
	 * @see UniverityU.UniverityUPackage#getPerson_Relatives()
	 * @model
	 * @generated
	 */
	aPerson getRelatives();

	/**
	 * Sets the value of the '{@link UniverityU.Person#getRelatives <em>Relatives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relatives</em>' reference.
	 * @see #getRelatives()
	 * @generated
	 */
	void setRelatives(aPerson value);

} // Person
