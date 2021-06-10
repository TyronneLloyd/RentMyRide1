package za.ac.cput.Factory;
/* CarFactoryTest.java
   Test class for Car Factory
   Author: Rick Allen Herbert (219014337)
   Date: 08 June 2021
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Car;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {

    @Test
    void createCarTest() {
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);
        System.out.println(fordMustang);
        assertNotNull(fordMustang);
    }

    @Test
    void ObjectIdentityCarTest() {
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);
        assertSame("Blue", fordMustang.getColor());
        assertNotSame("Red", fordMustang.getColor());
    }

    @Test
    void ObjectEqualityCarTest() {
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);

        assertEquals(9500,fordMustang.getRentalPrice());
    }

    @Test
    @Disabled
    void DisableCarTest() {
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);
        System.out.println(fordMustang);
        assertNotNull(fordMustang);
    }

    @Test
    @Timeout(15)
    void TimeoutCarTest() throws InterruptedException{
        Thread.sleep(30);
        Car fordMustang = CarFactory.createCar("412556", "Blue","Ford", "Mustang", 9500.00, "Storage Unit 6", true);
        assertEquals("Ford", fordMustang.getMake());
        System.out.println(fordMustang.getMake());
    }

}