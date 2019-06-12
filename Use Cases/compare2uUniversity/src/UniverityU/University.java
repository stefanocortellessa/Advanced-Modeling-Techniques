/**
 */
package UniverityU;

import UniverityU.uncertainty.ModelElement;
import UniverityU.uncertainty.aCourses;
import UniverityU.uncertainty.aUniversity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UniverityU.University#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see UniverityU.UniverityUPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends ModelElement, aUniversity {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link UniverityU.uncertainty.aCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see UniverityU.UniverityUPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<aCourses> getCourses();

} // University
