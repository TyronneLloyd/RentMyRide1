package za.ac.cput.Factory;

/*
   @Description:CarLotFactory.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 4 June 2021
 */
import za.ac.cput.Entity.CarLot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarLotFactoryTest {

    @Test
    public void createCarLot()
    {
        CarLot carLot = CarLotFactory.createCarLot("D9556852");
        assertNotNull(carLot);
        System.out.println(carLot);
    }

}
