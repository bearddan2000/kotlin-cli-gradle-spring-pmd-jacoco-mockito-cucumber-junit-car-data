import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import example.model.Car;
import example.service.*;

@ExtendWith(MockitoExtension::class)
class CarPrice {

  @InjectMocks
  val service = CarServiceImpl();

  @When("^Car created$")
  fun createCar(): Car {
     return service.createCar();
  }

  @Then("^Car price should be 0.0$")
  fun checkPrice() {
    val car = createCar()
    Assertions.assertEquals(car.price, 0.0);
  }
}
