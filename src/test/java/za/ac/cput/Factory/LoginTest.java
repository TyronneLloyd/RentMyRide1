package za.ac.cput.Factory;
/*
    @Description: TDD for Login Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.ClientAccount;
import za.ac.cput.Entity.Login;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginTest
{
    @Test
    public void createLoginTest()
    {
        ClientAccount account = ClientAccountFactory.createClientAccount("4");

        Login login = LoginFactory.createLogin("01","Hanjiwe");

        System.out.println(login);
        assertNotNull(login);

    }
}
