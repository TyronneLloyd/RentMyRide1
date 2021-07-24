/* CarRepositoryTest.java
   Test for implementation of Car Repository
   Author: Rick Allen Herbert (219014337)
   Date: 24 July 2021
*/
package za.ac.cput.repository.car.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Car;
import za.ac.cput.factory.CarFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class CarRepositoryTest {

    private static CarRepository repository = CarRepository.getRepository();
    private static Car car = CarFactory.createCar(
            "412556",
            "Blue",
            "Ford",
            "Mustang",
            9500.00,
            "Storage Unit 6",
            true);

    @Test
    void a_createCar() {
        Car created = repository.create(car);
        assertEquals(created.getNumberPlate(), car.getNumberPlate());
        System.out.println("Create: " + created);
    }

    @Test
    void b_readCar() {
        Car read = repository.read(car.getNumberPlate());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_updateCar()
    {
        Car updated = new Car.Builder().copy(car).color("Red").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update:" + updated);
    }

    @Test
    void d_deleteCar()
    {
        boolean success = repository.delete(car.getNumberPlate());
        assertTrue (success);
        System.out.println("Delete:" + success);
    }

    @Test
    void e_getAllCar(){
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}