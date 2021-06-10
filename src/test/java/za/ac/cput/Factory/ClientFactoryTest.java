package za.ac.cput.Factory;

/*
   @Description:ClientFactoryTest.java
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 3 June 2021
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Client;
import static org.junit.jupiter.api.Assertions.*;

class ClientFactoryTest {
    @Test
    public void createClient(){
     System.out.println("Creating clients...");
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560", "100000000005");
        Client client2 = ClientFactory.createClient("John", "Johnson", "0721238560", "100000000006");
        Client client3 = ClientFactory.createClient("Peter", "Peterson", "0722639870", "100000000007");
        assertNotNull(client);
        assertNotNull(client2);
        assertNotNull(client3);
        System.out.println(client);
        System.out.println(client2);
        System.out.println(client3);
    }

    // Object Identity
    @Test
    void testIdentity(){
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560", "100000000005");
        Client client2 = ClientFactory.createClient("John", "Johnson", "0721238560", "100000000006");
        Client client3 = ClientFactory.createClient("Peter", "Peterson", "0722639870", "100000000007");
        Client client4 = client2;
        assertSame(client4,client2);
    }

    // Object Equality
    @Test
    void testEquality(){
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560", "100000000005");
        Client client2 = ClientFactory.createClient("John", "Johnson", "0721238560", "100000000006");
        Client client3 = ClientFactory.createClient("Peter", "Peterson", "0722639870", "100000000007");
        Client client4 = client2;
        assertEquals(client2,client4);
    }

    // Timeouts
    @Test
    @Timeout(6)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(5000);
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560", "100000000005");
        assertNotNull(client);
        System.out.println("Test passed within the time");
    }

    // Disabling Test
    @Test
    @Disabled("Disabled to demonstrate disabling test")
    public void testDisabled(){
        System.out.println("This should be disabled to demonstrate disabling test");
        Client client = ClientFactory.createClient("Cole", "Hanekom", "0721234560", "100000000005");
        assertNotNull(client);
        System.out.println(client);
    }
}