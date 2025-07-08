package com.shristi.carapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity // carclass 
public class Car {
	@Column(length=20)
	private String carName;
	@Column(length=20)
	private String company ;
	@Id
	private Integer carId;
	private double price;
	
	

	
	
	
}
