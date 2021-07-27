package za.ac.cput.repository.carlot;

/*
   @Description:CarLotRepository.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 22 July 2021
 */

import za.ac.cput.entity.CarLot;

import java.util.*;

public class CarLotRepository implements ICarLotRepository {

    private static CarLotRepository repository = null;
    private Set<CarLot> carLots = null;

    private CarLotRepository()
    {
        carLots = new HashSet<CarLot>();
    }

    public static CarLotRepository getRepository()
    {
        if(repository == null){
            repository = new CarLotRepository();
        }
        return repository;
    }

    @Override
    public CarLot create(CarLot carLot)
    {
        boolean success = carLots.add(carLot);
        if(!success)
            return null;
        return carLot;
    }

    @Override
    public CarLot read(String carLotID)
    {
        for (CarLot c: carLots)
            if(c.getNumberPlate().equalsIgnoreCase(carLotID)){
                return c;
            }
        return null;
    }

    @Override
    public CarLot update(CarLot carLot)
    {
        CarLot oldCarLot = read(carLot.getNumberPlate());
        if(oldCarLot != null){
            carLots.remove(oldCarLot);
            carLots.add(carLot);
            return carLot;
        }
        return null;
    }

    @Override
    public boolean delete(String carLotID)
    {
        CarLot carLotRemoved = read(carLotID);
        if(carLotRemoved == null)
            return false;
        carLots.remove(carLotRemoved);
        return true ;
    }

    @Override
    public Set<CarLot> getAll()
    {
        return carLots;
    }
}

