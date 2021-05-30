package ch.resttest.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepository studentRepository; 
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	public List<Student> getStudentExample()
	{
		return studentRepository.findAll();
	}


	public void addNewStudent(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> studentOptional = studentRepository.findStudentByEnail(student.getEmail());
		if(studentOptional.isPresent()) {
			throw new IllegalStateException("email taken");
			
		}
		studentRepository.save(student);
	}
	
}
