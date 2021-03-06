package za.ac.cput.factory;

/*
   @Description:ClientFactory.java
   @Author: Cole Hanekom
   @Student Number: 217267556
   @Date: 3 June 2021
 */

import za.ac.cput.entity.Client;
import za.ac.cput.util.GenericHelper;

public class ClientFactory {
    public static Client createClient(String name, String surname, String contactNumber, String accountNumber) {
        String clientId = GenericHelper.generateId();

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
