/**
 */
package UniverityU.uncertainty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uUniversity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.uncertainty.uUniversity#getUleft <em>Uleft</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uUniversity#getUright <em>Uright</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uUniversity#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see UniverityU.uncertainty.UncertaintyPackage#getuUniversity()
 * @model
 * @generated
 */
public interface uUniversity extends aUniversity, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aUniversity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuUniversity_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<aUniversity> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aUniversity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuUniversity_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<aUniversity> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.uUniversity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuUniversity_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uUniversity> getUpoint();

} // uUniversity
