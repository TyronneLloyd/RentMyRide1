package za.ac.cput.Factory;
/*
    @Description: TDD for ClientAccount Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.ClientAccount;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClientAccountTest
{
    @Test
    public void createClientAccountTest(){
        ClientAccount account = ClientAccountFactory.createClientAccount("4","0325");
        System.out.println(account);
        assertNotNull(account);
    }
}
