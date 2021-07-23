package za.ac.cput.repository.carlot.impl;

/*
   @Description:CarLot.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 22 July 2021
 */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.CarLot;
import za.ac.cput.factory.CarLotFactory;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CarLotRepositoryTest
{
    private static CarLotRepository repository = CarLotRepository.getRepository();
    private static CarLot carLot = CarLotFactory.createCarLot("84D546Y4","54HH");

    @Test
    @Order(1)
    void create()
    {
        CarLot create = repository.create(carLot);
        assertEquals(create.getNumberPlate(),carLot.getNumberPlate());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read()
    {
        CarLot read = repository.read(carLot.getNumberPlate());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update()
    {
        CarLot updated = new CarLot.Builder().copy(carLot).setParkingSpace("54HH").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }
    @Test
    @Order(4)
    void getAll()
    {
        System.out.println("Display All: ");
        System.out.println(repository.getAll());
    }

    @Test
    @Order(5)
    void delete()
    {
        boolean success = repository.delete(carLot.getNumberPlate());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

}