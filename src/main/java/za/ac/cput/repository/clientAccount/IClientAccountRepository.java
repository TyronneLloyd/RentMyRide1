package za.ac.cput.repository.clientAccount;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.repository.IRepository;

import java.util.Set;


public interface IClientAccountRepository extends IRepository<ClientAccount,String>
{
    Set<ClientAccount> getAll();
}
