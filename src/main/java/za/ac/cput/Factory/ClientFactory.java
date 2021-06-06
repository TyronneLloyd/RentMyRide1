package za.ac.cput.Factory;

/*
   @Description:ClientFactory.java
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 3 June 2021
 */

import za.ac.cput.Entity.Client;
import za.ac.cput.Util.GenericHelper;

public class ClientFactory {
    public static Client createClient(String name, String surname, String contactNumber) {
        String clientId = GenericHelper.generateId();
        String accountNumber = GenericHelper.generateAccountNumber();
        Client client = new Client.Builder()
                .setClientID(clientId)
                .setName(name)
                .setSurname(surname)
                .setContactNumber(contactNumber)
                .setAccountNumber(accountNumber)
                .build();

        return client;
    }
}
