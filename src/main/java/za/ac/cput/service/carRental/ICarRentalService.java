package za.ac.cput.service.carRental;

import za.ac.cput.entity.CarRental;
import za.ac.cput.service.IService;

import java.util.Set;

/*
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 30 July 2021
  */

public interface ICarRentalService extends IService<CarRental, String> {
    Set<CarRental> getAll();
}
