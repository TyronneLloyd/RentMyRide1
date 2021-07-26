package za.ac.cput.repository.clientAccount.impl;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.repository.clientAccount.IClientAccountRepository;

import java.util.HashSet;
import java.util.Set;

/*
    @Description: Repository ClientAccount Entity ->
    @Author: Asiphiwe Hanjiwe
    @Student Number: 218336675
    @Date: 20 July 2021
 */
public class ClientAccountRepository implements IClientAccountRepository {

    private static ClientAccountRepository repository = null;
    private Set<ClientAccount> clientAccountDB = null;

    private ClientAccountRepository()
    {
        clientAccountDB = new HashSet<ClientAccount>();
    }

    public static ClientAccountRepository getRepository()
    {
        if(repository == null)
        {
            repository = new ClientAccountRepository();
        }
        return repository;
    }


    @Override
    public ClientAccount create(ClientAccount newAccount) {
            boolean success = clientAccountDB.add(newAccount);
            if(!success)
                return null;
            return newAccount;
    }

    @Override
    public ClientAccount read(String accountID) {

        for (ClientAccount acc: clientAccountDB)
        {
            if (acc.getAccountNum().equalsIgnoreCase(accountID))
            {

                return acc;
            }
        }
        return null;
    }

    @Override
    public ClientAccount update(ClientAccount account) {
        ClientAccount oldAccount = read(account.getAccountNum());
        if (oldAccount!=null)
        {
            clientAccountDB.remove(oldAccount);
            clientAccountDB.add(account);
            return account;
        }
        return null;
    }

    @Override
    public boolean delete(String account) {
       ClientAccount accountDeleted = read(account);
        if(accountDeleted == null)
            return false;
        clientAccountDB.remove(accountDeleted);
        return true ;
    }

    @Override
    public Set<ClientAccount> getAll() {
        return clientAccountDB;
    }
}
