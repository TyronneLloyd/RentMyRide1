package za.ac.cput.factory;
/*
    @Description: TDD for ClientAccount Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.entity.ClientAccount;

import static org.junit.jupiter.api.Assertions.*;

public class ClientAccountFactoryTest
{
    ClientAccount account = ClientAccountFactory.createClientAccount("4","0325");
    @Test
    public void createClientAccountTest(){

        System.out.println(account);
        assertNotNull(account);
    }

    @Test
    void testEquality()
    {

        assertEquals("0325",account.getAccountNum());

    }
    @Test
    void testIdentity()
    {
        assertSame("4",account.getNumBorrowed());
    }
    @Test
    @Disabled
    void  createClientAccountDisable()
    {
        System.out.println(account);
        assertNotNull(account);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("Time up for test");
    }
}
