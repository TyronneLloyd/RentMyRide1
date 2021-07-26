package za.ac.cput.repository.clientAccount;

import za.ac.cput.entity.ClientAccount;

import java.util.Set;


public interface IClientAccountRepository extends IRepository<ClientAccount,String>
{
    Set<ClientAccount> getAll();
}
