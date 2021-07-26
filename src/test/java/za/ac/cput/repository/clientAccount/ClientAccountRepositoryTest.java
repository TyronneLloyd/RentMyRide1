package za.ac.cput.repository.clientAccount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.ClientAccount;
import za.ac.cput.factory.ClientAccountFactory;
import za.ac.cput.repository.clientAccount.impl.ClientAccountRepository;

import static org.junit.jupiter.api.Assertions.*;

class ClientAccountRepositoryTest {
    private static ClientAccountRepository repo = ClientAccountRepository.getRepository();
private static ClientAccount clientAccount = ClientAccountFactory.createClientAccount("5","512715");

    @Test
    @Order(1)
    void create() {
        ClientAccount createAccount = repo.create(clientAccount);
        assertEquals(createAccount.getAccountNum(),clientAccount.getAccountNum());
        System.out.println("Created: " + createAccount);
    }
    @Test
    @Order(2)
    void read() {
        ClientAccount read = repo.read(clientAccount.getAccountNum());
        assertNotNull(read);
        System.out.println("Read: " + read);

    }
    @Test
    @Order(3)
    void update() {
        ClientAccount updated = new ClientAccount.Builder().copy(clientAccount).setAccountNum("5127155687").setNumBorrowed("52").build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated: " + updated);
    }
    @Test
    @Order(4)
    void getAll() {
        System.out.println("Display All: ");
        System.out.println(repo.getAll());

    }
    @Test
    @Order(5)
    void delete() {
        boolean delete = repo.delete(clientAccount.getAccountNum());
        assertTrue(delete);
        System.out.println("Deleted: " + delete);


    }
    }

