package za.ac.cput.service;

/*
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 30 July 2021
  */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.CarRental;
import za.ac.cput.factory.CarRentalFactory;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalServiceTest {
    private static CarRentalService service = CarRentalService.getService();
    private static CarRental carRental = CarRentalFactory.createCarRental("client01","2cool4u","1000001","20-06-2021","28-06-2021");


    @Test
    void create() {
        CarRental createCarRental = service.create(carRental);
        assertEquals(createCarRental.getRentalID(), carRental.getRentalID());
        System.out.println("Create Test: " + createCarRental);
    }

    @Test
    void read() {
        CarRental readCarRental = service.read(carRental.getNumberPlate());
        assertNotNull(readCarRental);
        System.out.println("read Test: " + readCarRental);
    }

    @Test
    void update() {
        CarRental updateCarRental = new CarRental.Builder().copy(carRental).setNumberPlate("RideOrDie").build();
        assertNotNull(service.update(updateCarRental));
        System.out.println("update Test: " + updateCarRental);
    }

    @Test
    void delete() {
        boolean success = service.delete(carRental.getNumberPlate());
        assertTrue(success);
        System.out.println("Delete Test: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Display All CarRental:");
        System.out.println(service.getAll() );
    }
}