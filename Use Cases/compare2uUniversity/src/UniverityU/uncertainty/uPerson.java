/**
 */
package UniverityU.uncertainty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uPerson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.uncertainty.uPerson#getUleft <em>Uleft</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uPerson#getUright <em>Uright</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uPerson#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see UniverityU.uncertainty.UncertaintyPackage#getuPerson()
 * @model
 * @generated
 */
public interface uPerson extends aPerson, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aPerson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuPerson_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<aPerson> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aPerson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuPerson_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<aPerson> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.uPerson}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuPerson_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uPerson> getUpoint();

} // uPerson
