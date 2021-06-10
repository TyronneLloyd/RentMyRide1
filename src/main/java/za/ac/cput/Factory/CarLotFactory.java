package za.ac.cput.Factory;

/*
   @Description:CarLotFactory.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 4 June 2021
 */

import za.ac.cput.Entity.CarLot;
import za.ac.cput.Util.GenericHelper;

public class CarLotFactory {

    public static CarLot createCarLot(String numberPlate, String parkingSpace){
        CarLot carLot = new CarLot.Builder()
                .setParkingSpace(parkingSpace)
                .setNumberPlate(numberPlate)
                .build();
        return carLot;


    }


}
