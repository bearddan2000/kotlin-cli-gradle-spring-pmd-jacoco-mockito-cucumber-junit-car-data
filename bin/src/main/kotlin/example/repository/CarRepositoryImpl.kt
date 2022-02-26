package example.repository;

import org.springframework.stereotype.Repository;
import example.model.Car;

@Repository
class CarRepositoryImpl : CarRepository {
  override fun createCar(price: Double, year: Integer, model: String, make: String): Car = Car(price,year,model,make)
}
