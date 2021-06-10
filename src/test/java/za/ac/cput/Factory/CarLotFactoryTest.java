package za.ac.cput.Factory;

/*
   @Description:CarLotFactory.java
   @Author: Elrich Herman
   @Student Number: 218150040
   @Date: 4 June 2021
 */
import za.ac.cput.Entity.CarLot;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CarLotFactoryTest {

    @Test
    public void createCarLot()
    {
        CarLot carLot = CarLotFactory.createCarLot("D9556852", "78");
        assertNotNull(carLot);
        System.out.println(carLot);
    }

    @Test
    public void objectIdentity(){
        CarLot carLot = CarLotFactory.createCarLot("D9556852", "78");
        assertSame("D9556852", carLot.getNumberPlate());
        System.out.println(carLot.getNumberPlate());
    }

    @Test
    void objectEquality(){
        CarLot carLot = CarLotFactory.createCarLot("D9556852", "78");
        assertEquals("78", carLot.getParkingSpace());
        System.out.println(carLot.getParkingSpace());
    }


    @Test
    @Timeout(15)
    void TimeoutCheck() {
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
    }

    @Disabled
    @Test
    void objectEquality2(){
        CarLot carLot = CarLotFactory.createCarLot("D9556852", "78");
        assertNotNull(carLot);
    }

}
