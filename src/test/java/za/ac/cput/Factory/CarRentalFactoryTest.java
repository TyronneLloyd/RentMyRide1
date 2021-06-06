package za.ac.cput.Factory;

/*
    @Description: CarRentalFactory.java
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 3 June 2021
  */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.CarRental;

import static org.junit.jupiter.api.Assertions.*;

class CarRentalFactoryTest {

    @Test void test(){
        CarRental carRental = CarRentalFactory.createCarRental("client","numberplate","employeeNum","rentStart","rentEnd");
        System.out.println(carRental);
        assertNotNull(carRental);

    }

}