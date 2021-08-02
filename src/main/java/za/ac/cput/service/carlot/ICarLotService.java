package za.ac.cput.service.carlot;

/*
   @Description:ICarLotService.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 02 August 2021
 */

import za.ac.cput.entity.CarLot;
import za.ac.cput.service.IService;
import java.util.Set;

public interface ICarLotService extends IService<CarLot, String> {
    Set<CarLot> getAll();
}