package za.ac.cput.repository.carRental.impl;
/*
    @Description: CarRental.java -> Car Rental class facilitates the renting of cars and records them
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 25 July 2021
  */

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.CarRental;
import za.ac.cput.factory.CarRentalFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CarRentalRepositoryTest {
    private static CarRentalRepository repository = CarRentalRepository.getRepository();
    private static CarRental carRental = CarRentalFactory.createCarRental("client57","2cool4u","1000006","25-07-2021","28-08-2021");

    @Test
    void create() {
        CarRental created = repository.create(carRental);
        assertEquals(created.getRentalID() ,carRental.getRentalID() );
        System.out.println("Create Test: " + created);
    }

    @Test
    void read() {
        CarRental read = repository.read(carRental.getNumberPlate());
        assertNotNull(read);
        System.out.println("Read Test: " + read);
    }

    @Test
    void update() {
        CarRental updated = new CarRental.Builder().copy(carRental).setRentalEndDate("11-09-2021").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update Test: " + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(carRental.getRentalID());
        assertTrue(success);
        System.out.println("Delete Test: " + success);
    }

    @Test
    void getAll() {
        System.out.println("Get All Test: \n" + repository.getAll());
    }
}