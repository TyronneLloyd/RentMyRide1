package za.ac.cput.service;

/*
    @Description:CllientService
    @Author: Cole Hanekom
    @Student Number: 217267556
    @Date: 28 July 2021
*/

import za.ac.cput.entity.Client;
import za.ac.cput.repository.client.ClientRepository;
import za.ac.cput.service.client.IClientService;
import java.util.Set;

public class ClientService implements IClientService {
    private static  ClientService service = null;
    private ClientRepository repository = null;

    private ClientService(){this.repository = ClientRepository.getRepository();}

    public static ClientService getService(){
        if(service == null){
            service = new ClientService();
        }
        return service;
    }
    @Override
    public Client create(Client client){return this.repository.create(client);}

    @Override
    public Client read(String clientID){return this.repository.read(clientID);}

    @Override
    public Client update(Client client){return this.repository.update(client);}

    @Override
    public boolean delete(String clientID){
       return this.repository.delete(clientID);
    }

    @Override
    public Set<Client> getAll() {
        return this.repository.getAll();
    }
}
