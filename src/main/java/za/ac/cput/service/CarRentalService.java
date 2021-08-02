package za.ac.cput.service;

/*
    @title: CarRentalService
    @Author: Grant Hendricks
    @Student Number: 215138848
    @Date: 30 July 2021
  */

import za.ac.cput.entity.CarRental;
import za.ac.cput.repository.carRental.CarRentalRepository;
import za.ac.cput.service.carRental.ICarRentalService;
import java.util.Set;

public class CarRentalService implements ICarRentalService {
    private static CarRentalService service = null;
    private CarRentalRepository repository = null;

    private CarRentalService() {
        this.repository = CarRentalRepository.getRepository();
    }

    public static CarRentalService getService(){
        if(service == null){
            service = new CarRentalService();
        }
        return service;
    }

    @Override
    public CarRental create(CarRental createRental) {
        return this.repository.create(createRental);
    }

    @Override
    public CarRental read(String readRental) {
        return this.repository.read(readRental);
    }

    @Override
    public CarRental update(CarRental upRental) {
        return this.repository.update(upRental);
    }

    @Override
    public boolean delete(String delRental) {
        return this.repository.delete(delRental);
    }

    @Override
    public Set<CarRental> getAll() {
        return this.repository.getAll();
    }
}
