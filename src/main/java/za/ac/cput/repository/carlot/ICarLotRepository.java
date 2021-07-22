package za.ac.cput.repository.carlot;

/*
   @Description:CarLot.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 22 July 2021
 */

import za.ac.cput.entity.CarLot;
import za.ac.cput.repository.IRepository;
import java.util.*;

public interface ICarLotRepository extends IRepository<CarLot, String>
{
    Set<CarLot> getAll();

}
