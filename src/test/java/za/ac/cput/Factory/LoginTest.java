package za.ac.cput.Factory;
/*
    @Description: TDD for Login Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.ClientAccount;
import za.ac.cput.Entity.Login;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest
{
    Login login = LoginFactory.createLogin("01","Han@29087","Asiphiwe");
    @Test
    public void createLoginTest()
    {
        System.out.println(login);
        assertNotNull(login);

    }
    @Test
    void testEquality()
    {
        assertEquals("Han@29087",login.getPassword());

    }
    @Test
    void testIdentity()
    {
        assertSame("Asiphiwe",login.getUsername());
    }

    @Test
    @Disabled
    void  createClientAccountDisable()
    {
        assertNotNull(login);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException
    {
        Thread.sleep(100);
        System.out.println("Time up for test");
    }
}
