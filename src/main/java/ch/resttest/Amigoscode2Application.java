package ch.resttest;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * TODO[] watch spring-data-jpa-tutorial
 * */
import ch.resttest.student.Student;

@RestController
@SpringBootApplication
public class Amigoscode2Application {

	public static void main(String[] args) {
		SpringApplication.run(Amigoscode2Application.class, args);
	}
	
	@GetMapping
	public List<String> hello() 
	{
		return List.of("Hello"," World");
	}

	/*
	 * Just playing arround to figure out if 
	 * the Return result is displayed in the browser
	 * */
	@GetMapping("/hello/there")
	public String there() 
	{
		return "HelloThere";
	}
	

}
