package example.service;

import example.model.Car;
import example.repository.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
class CarServiceImpl : CarService {

  val carRepository: CarRepository = CarRepositoryImpl()

  fun createOneCar(): Car = carRepository.createCar(0.00, Integer(0), "test", "test");

  fun createList(): MutableList<Car> {
    return mutableListOf<Car>(
      carRepository.createCar(0.00, Integer(0), "0", "0"),
      carRepository.createCar(1.00, Integer(1), "1", "1"),
      carRepository.createCar(2.00, Integer(2), "2", "2")
    );
  }

  override fun createCar(): Car = createOneCar()

  override fun createRandomCar(): Car = createList().random();

  override fun addCar(): MutableList<Car> {
    var lst = createList();
    lst.add(createOneCar());
    return lst;
  }

  override fun deleteCar(): MutableList<Car> {
    var lst = createList();
    lst.removeFirst();
    return lst;
  }

  override fun findAll(): MutableList<Car> = createList()

}
