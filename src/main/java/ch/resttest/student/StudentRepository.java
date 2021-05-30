package ch.resttest.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
 * Responsible for data access
 * */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
