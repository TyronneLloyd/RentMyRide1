package za.ac.cput.Factory;
/* CarFactoryTest.java
   Test class for Car Factory
   Author: Rick Allen Herbert (219014337)
   Date: 08 June 2021
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createCar() {
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);
        System.out.println(fordMustang);
        assertNotNull(fordMustang);

    }

}