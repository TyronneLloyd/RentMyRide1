package za.ac.cput.repository.carRental.impl;
/*
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
    void a_create() {
        CarRental created = repository.create(carRental);
        assertEquals(created.getRentalID() ,carRental.getRentalID() );
        System.out.println("Create Test: " + created);
    }

    @Test
    void b_read() {
        CarRental read = repository.read(carRental.getRentalID());
        assertNotNull(read);
        System.out.println("Read Test: " + read);
    }

    @Test
    void c_update() {
        CarRental myUpdated = new CarRental.Builder().copy(carRental).setRentalEndDate("11-09-2021").setClientID("client01").setNumberPlate("2cool4u").setEmployeeNumber("1000001").build();
        assertNotNull(repository.update(myUpdated));
        System.out.println("Update Test: " + myUpdated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(carRental.getRentalID());
        assertTrue(success);
        System.out.println("Delete Test: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Get All Test: \n" + repository.getAll());
    }
}