package za.ac.cput.repository.client;

/*
    @Description:ClientRepositoryTest ->
    @Author: Cole Hanekom
    @Student Number: 217267556
    @Date: 21 July 2021
*/

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Client;
import za.ac.cput.factory.ClientFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ClientRepositoryTest {
    private static ClientRepository repository = ClientRepository.getRepository();
    private static Client client = ClientFactory.createClient("Thiago", "Silva", "0722224560", "100000000009");

    @Test
    void a_create() {
        Client created = repository.create(client);
        assertEquals(created.getClientID(), client.getClientID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Client read = repository.read(client.getClientID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Client updated = new Client.Builder().copy(client).setSurname("Alcantara").build();
        assertNotNull(repository.update(updated));
        System.out.println("Update: " + updated);
    }

    @Test
    void e_delete() {
        boolean success = repository.delete(client.getClientID());
        assertTrue(success);
        System.out.println("Delete: " + success);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}