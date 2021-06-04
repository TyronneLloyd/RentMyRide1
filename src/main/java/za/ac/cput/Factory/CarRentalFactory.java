package za.ac.cput.Factory;

/*
    @Description: CarRentalFactory.java
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 3 June 2021
  */

import za.ac.cput.Entity.CarRental;
import za.ac.cput.Util.GenericHelper;

public class CarRentalFactory {
    public static CarRental createCarRental(String clientID, String numberPlate, String employeeNumber, String rentalStartDate, String rentalEndDate){
        String rentalID = GenericHelper.generateId();

        CarRental carRental = new CarRental.Builder()
                .setRentalID(rentalID)
                .setClientID(clientID)
                .setNumberPlate(numberPlate)
                .setEmployeeNumber(employeeNumber)
                .setRentalStartDate(rentalStartDate)
                .setRentalEndDate(rentalEndDate)
                .build();

        return carRental;
    }

}
