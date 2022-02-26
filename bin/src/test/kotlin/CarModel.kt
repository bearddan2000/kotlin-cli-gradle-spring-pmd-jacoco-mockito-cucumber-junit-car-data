import io.cucumber.java.en.Then;


import org.junit.jupiter.api.Assertions;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import example.model.Car;
import example.service.*;

@ExtendWith(MockitoExtension::class)
class CarModel {

  @InjectMocks
  val service = CarServiceImpl();

  @Then("Car model should be test")
  fun checkModel() {
    val car = service.createCar();
     Assertions.assertEquals(car.model, "test");
  }
}
