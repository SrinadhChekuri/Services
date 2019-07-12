/**
 * 
 */
package org.srinadh.repository;

import org.springframework.stereotype.Repository;
import org.srinadh.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author cheku
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
