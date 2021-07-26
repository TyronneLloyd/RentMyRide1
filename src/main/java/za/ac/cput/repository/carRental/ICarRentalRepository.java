package za.ac.cput.repository.carRental;

/*
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 23 July 2021
  */

import za.ac.cput.entity.CarRental;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface ICarRentalRepository extends IRepository<CarRental, String> {
    public Set<CarRental> getAll();
}
