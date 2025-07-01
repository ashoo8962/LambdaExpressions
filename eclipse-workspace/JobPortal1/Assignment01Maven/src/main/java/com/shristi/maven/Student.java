package com.shristi.maven;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.shristi.maven.Department;

@Component

@PropertySource("classpath:application.properties")

public class Student {

	private String studentName;
	private String studentId;
	private String city;
	private Department department;
	//no default constr
	//no need to setter method for dept
	//add parameterized constr wid dependencies
	//dont add primitive types in constr
// no need to autowired dependenccy inject
	
	public Student(Department department) {
		super();
		this.department = department;
	}

	public String getStudentName() {
		return studentName;
	}

@Value("${student.name}")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentId() {
		return studentId;
	}

	@Value("${student.id}")
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getCity() {
		return city;
	}

	@Value("${student.city}")
	public void setCity(String city) {
		this.city = city;
	}

	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", city=" + city + "]";
	}
}
