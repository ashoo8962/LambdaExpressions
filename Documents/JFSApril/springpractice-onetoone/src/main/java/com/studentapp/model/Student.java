package com.studentapp.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

	@Column(length=20)
	private String studentName;
	@Id
	@GeneratedValue(generator="student_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="student_gen",sequenceName="student_seq",initialValue=100)
	private Integer studentId;
	@Column(length=20)
	private String department;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="add_id")
	private Address address;

	
	
}
