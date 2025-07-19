package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.AddressDto;
import com.studentapp.model.StudentDto;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringpracticeOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeOnetomanyApplication.class, args);
	}
	
	@Autowired
	private IStudentService studentService;

	
	@Override
	public void run(String... args) throws Exception {

		AddressDto addressDto = new AddressDto("Bengaluru",null,"Karnataka");
		AddressDto addressDto1 = new AddressDto("Mumbai",null,"Maharashtra");

		StudentDto studentDto = new StudentDto("Bob", null, "EXTC", addressDto);
		StudentDto studentDto1 = new StudentDto("Kevin", null, "CSE", addressDto1);

		studentService.addStudent(studentDto);
		studentService.addStudent(studentDto1);

		System.out.println("get by city");
		studentService.getByCity("Bengaluru").forEach(System.out::println);


		System.out.println("get by state");
		studentService.getByCity("Maharashtra").forEach(System.out::println);

		
	}

}
