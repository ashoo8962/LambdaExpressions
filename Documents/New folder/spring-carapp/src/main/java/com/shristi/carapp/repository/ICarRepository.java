package com.shristi.carapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shristi.carapp.model.Car;

public interface ICarRepository extends JpaRepository<Car,Integer> {

}
