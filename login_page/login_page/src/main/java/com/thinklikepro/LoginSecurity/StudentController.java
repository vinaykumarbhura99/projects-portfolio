package com.thinklikepro.LoginSecurity;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	List<Student> student=new ArrayList<>(List.of(
			new Student(1,"anil",70),
			new Student(2,"sunny",75)
			));
	
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return student;
	}
	
	
	@GetMapping("/csrfToken")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		
		return  (CsrfToken) request.getAttribute("_csrf");
		
	}

	@PostMapping("/student")
	public List<Student> saveStudents(@RequestBody Student student1) {
		student.add(student1);
		
		return student;
	}

}
