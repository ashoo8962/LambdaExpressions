package com.shristi.carapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shristi.carapp.model.Car;
import com.shristi.carapp.repository.ICarRepository;

@Service
public class CarServiceImpl implements ICarService {
//icarrepo  var to get all predefined ()'s
	private ICarRepository carRepository;

	@Autowired
	public void setCarRepository(ICarRepository carRepository) {
		this.carRepository = carRepository;
	}


	
	@Override
	public Car addCar(Car car) {
		Car ncar = carRepository.save(car);
		return ncar;
	}

	@Override
	public Car updateCar(Car car) {
		Car ncar = carRepository.save(car);
		return ncar;		
	}

	@Override
	public void deleteCar(int carId) {
		carRepository.deleteById(carId);

	}

	
	public Car getById(int carId) {
		Optional<Car> carOpt= carRepository.findById(carId);
		if(carOpt.isPresent()) {
			Car car = carOpt.get();
			return car;
	}
	return null;
		
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
