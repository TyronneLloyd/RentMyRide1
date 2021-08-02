package za.ac.cput.service;

/*
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
    public CarRental create(CarRental t) {
        return this.repository.create(t);
    }

    @Override
    public CarRental read(String s) {
        return this.repository.read(s);
    }

    @Override
    public CarRental update(CarRental t) {
        return this.repository.update(t);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }

    @Override
    public Set<CarRental> getAll() {
        return this.repository.getAll();
    }
}
