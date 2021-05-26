package com.nocdib.amigoscode.springboot;

import com.nocdib.amigoscode.springboot.student.Student;
import java.time.LocalDate;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(1L, "Howard Bly", "howard.bly@hotmail.com", LocalDate.of(2000, 1, 5), 21)
		);
	}

}
