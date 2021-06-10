package za.ac.cput.Factory;

import za.ac.cput.Entity.ClientAccount;
import za.ac.cput.Util.GenericHelper;

/*
    @Description: ClientAccount Factory ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 04 June 2021
 */
public class ClientAccountFactory
{
    public  static ClientAccount createClientAccount (String numBorrowed, String accountNum)
    {
        ClientAccount clientAccount = new ClientAccount.Builder()
                .setAccountNum(accountNum)
                .setNumBorrowed(numBorrowed).build();

        return clientAccount;
    }

}

