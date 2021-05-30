package ch.resttest.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


/*
 * Responsible for data access
 * */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	/*
	 * Will be transformed in an SQL like 
	 * SELECT * FROM student where emeil = param
	 * JPAQL und nicht SQL
	 * */
	@Query("SELECT s FROM Student s WHERE s.email = ?1")
	Optional<Student> findStudentByEnail(String emailString);

}
