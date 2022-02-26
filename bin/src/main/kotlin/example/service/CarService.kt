package example.service;

import example.model.Car;

import org.springframework.stereotype.Service;

@Service
interface CarService {
  fun createCar(): Car;

  fun createRandomCar(): Car;

  fun addCar(): MutableList<Car>;

  fun deleteCar(): MutableList<Car>;

  fun findAll(): MutableList<Car>;

}
