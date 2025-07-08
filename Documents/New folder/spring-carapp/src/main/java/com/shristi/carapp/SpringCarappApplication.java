package com.shristi.carapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.shristi.carapp.model.Car;
import com.shristi.carapp.service.ICarService;

@SpringBootApplication
@EntityScan(basePackages = "com.shristi.carappmodel")
public class SpringCarappApplication implements CommandLineRunner {

	private ICarService carService;

	@Autowired
	public void setCarService(ICarService carService) {
		this.carService = carService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCarappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Car car = new Car("Rolls Royce", "BMW Group", 5, 2500000.00);
		carService.addCar(car);
		car = new Car("Maruti", "Hyundai", 4, 500000.00);
		carService.addCar(car);
		car = new Car("Audy ", "BMW Group", 9, 200000.00);
		carService.addCar(car);
		car = new Car("BMW", "BMW Group", 5, 5500000.00);
		carService.addCar(car);
		car = new Car("Baleno", "Suzuki Group", 5, 5500000.00);
		carService.addCar(car);

	}

}
