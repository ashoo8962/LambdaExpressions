package com.shristi.carapp.service;

import java.util.List;

import com.shristi.carapp.model.Car;

public interface ICarService {
//crud operations using inbult methods
	
	Car  addCar(Car car);
	Car  updateCar(Car car);
	void deleteCar(int carId);
	Car getById(int carId);
	List <Car> getAll();
	
	
	
	
	
}
