package za.ac.cput.repository.carRental.impl;
/*
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 23 July 2021
  */

import za.ac.cput.entity.CarRental;
import za.ac.cput.repository.carRental.ICarRentalRepository;
import java.util.HashSet;
import java.util.Set;

public class CarRentalRepository implements ICarRentalRepository {

    private static CarRentalRepository repository = null;
    private Set<CarRental> carRentalDB = null;

    private CarRentalRepository(){
        carRentalDB = new HashSet<CarRental>();
    }

    public static CarRentalRepository getRepository(){
        if (repository ==null){
            repository = new CarRentalRepository();
        }

        return repository;
    }

    @Override
    public CarRental create(CarRental carRental) {
        boolean success = carRentalDB.add(carRental);
        if (!success){
            return null;
        }
        else {
            return carRental;
        }
    }

    @Override
    public CarRental read(String rentalID) {
        for (CarRental cr: carRentalDB)
            if (cr.getRentalID().equals(rentalID)){
                return cr;
            }
            return null;
    }

    @Override
    public CarRental update(CarRental carRental) {
        CarRental oldCarRental = read(carRental.getRentalID());
        if (oldCarRental != null){
            carRentalDB.remove(oldCarRental);
            carRentalDB.add(carRental);
            return carRental;
        }
        return null;
    }

    @Override
    public boolean delete(String rentalID) {
        CarRental carRentalDelete = read(rentalID);
        if (carRentalDelete == null){
            return false;
        }
        else {
            carRentalDB.remove(carRentalDelete);
            return true;
        }

    }

    @Override
    public Set<CarRental> getAll() {
        return carRentalDB;
    }
}
