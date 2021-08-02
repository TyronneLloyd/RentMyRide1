package za.ac.cput.service;

/*
    @title: CarRentalServiceTest
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 30 July 2021
  */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.CarRental;
import za.ac.cput.factory.CarRentalFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CarRentalServiceTest {
    private static CarRentalService service = CarRentalService.getService();
    private static CarRental carRental = CarRentalFactory.createCarRental("client01","2cool4u","1000001","20-06-2021","28-06-2021");


    @Test
    @Order(1)
    void create() {
        CarRental createCarRental = service.create(carRental);
        assertEquals(createCarRental.getRentalID(), carRental.getRentalID());
        System.out.println("Create Test: " + createCarRental);
    }

    @Test
    @Order(2)
    void read() {
        CarRental readCarRental = service.read(carRental.getRentalID());
        assertNotNull(readCarRental);
        System.out.println("read Test: " + readCarRental);
    }

    @Test
    @Order(3)
    void update() {
        CarRental updateCarRental = new CarRental.Builder().copy(carRental).setNumberPlate("RideOrDie").build();
        assertNotNull(service.update(updateCarRental));
        System.out.println("update Test: " + updateCarRental);
    }

    @Test
    @Order(5)
    void delete() {
        boolean success = service.delete(carRental.getRentalID());
        assertTrue(success);
        System.out.println("Delete Test: " + success);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Display All CarRental:");
        System.out.println(service.getAll() );
    }
}