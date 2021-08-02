package za.ac.cput.factory;
/*
    @Description: TDD for Login Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.entity.Login;
import za.ac.cput.factory.LoginFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginFactoryTest
{
    @Test
    public void createLoginTest()
    {
        Login login = LoginFactory.createLogin("employee","Han@29087","Asiphiwe");
        System.out.println(login);
        assertNotNull(login);
    }
}
