package za.ac.cput.Factory;

/*
   @Description:ClientFactoryTest.java
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 3 June 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Client;
import static org.junit.jupiter.api.Assertions.*;

class ClientFactoryTest {
    @Test
    public void createClient(){
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560");
        assertNotNull(client);
        System.out.println(client);
    }
}