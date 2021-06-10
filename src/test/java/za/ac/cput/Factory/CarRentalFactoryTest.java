package za.ac.cput.Factory;

/*
    @Description: CarRentalFactoryTest.java
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 3 June 2021
  */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.CarRental;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalFactoryTest {

    CarRental carRental = CarRentalFactory.createCarRental("client01","2cool4u","1000001","20-06-2021","28-06-2021");

    @Test void test(){
        System.out.println(carRental);
        assertNotNull(carRental);
    }

    @Test
    void objectEquality() {
        assertEquals("20-06-2021", carRental.getRentalStartDate() );
    }

    @Test
    void objectIdentity() {
        assertSame("2cool4u", carRental.getNumberPlate());
    }

    @Test
    @Disabled
    void disable(){
        assertNotEquals(carRental.getRentalStartDate(), carRental.getRentalEndDate());
    }

    @Test
    @Timeout(200)
    void timeOut() throws InterruptedException {
        Thread.sleep(500);
        System.out.println(carRental.getRentalID() + " " + carRental.getEmployeeNumber() + " " + carRental.getClientID());
    }


}