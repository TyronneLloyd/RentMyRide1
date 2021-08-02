package za.ac.cput.service.clientAccount;

import za.ac.cput.entity.ClientAccount;
import za.ac.cput.service.IService;

import java.util.Set;

public interface IClientAccountService extends IService<ClientAccount, String> {
        Set<ClientAccount> getAll();
        }