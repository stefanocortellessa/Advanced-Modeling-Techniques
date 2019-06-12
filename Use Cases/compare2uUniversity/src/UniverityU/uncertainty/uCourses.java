/**
 */
package UniverityU.uncertainty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>uCourses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.uncertainty.uCourses#getUleft <em>Uleft</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uCourses#getUright <em>Uright</em>}</li>
 *   <li>{@link UniverityU.uncertainty.uCourses#getUpoint <em>Upoint</em>}</li>
 * </ul>
 *
 * @see UniverityU.uncertainty.UncertaintyPackage#getuCourses()
 * @model
 * @generated
 */
public interface uCourses extends aCourses, UData {
	/**
	 * Returns the value of the '<em><b>Uleft</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uleft</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuCourses_Uleft()
	 * @model containment="true"
	 * @generated
	 */
	EList<aCourses> getUleft();

	/**
	 * Returns the value of the '<em><b>Uright</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uright</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuCourses_Uright()
	 * @model containment="true"
	 * @generated
	 */
	EList<aCourses> getUright();

	/**
	 * Returns the value of the '<em><b>Upoint</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.uCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upoint</em>' containment reference list.
	 * @see UniverityU.uncertainty.UncertaintyPackage#getuCourses_Upoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<uCourses> getUpoint();

} // uCourses
