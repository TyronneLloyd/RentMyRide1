package za.ac.cput.repository.employee.impl;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 19 July 2021
*/
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.entity.Employee;
import za.ac.cput.factory.EmployeeFactory;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class EmployeeRepositoryTest {
    private static  EmployeeRepository repository = EmployeeRepository.getRepository();
    private static  Employee employee = EmployeeFactory.createEmployee("Calen","Windows", "Admin","141202141","ADP3");

    @Test
    @Order(1)
    void create() {
        Employee create = repository.create(employee);
        assertEquals(create.getEmployeeNumber(),employee.getEmployeeNumber());
        System.out.println("Created: " + create);
        System.out.println(" ");
    }

    @Test
    @Order(2)
    void read() {
        Employee read = repository.read(employee.getEmployeeNumber());
        assertNotNull(read);
        System.out.println("Read: " + read);
        System.out.println(" ");

    }

    @Test
    @Order(3)
    void update() {
        Employee updated = new Employee.Builder().copy(employee).setName("Caleb").setSurname("Ruiters").build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
        System.out.println(" ");
    }

    @Test
    @Order(5)
    void delete() {
        boolean success = repository.delete(employee.getEmployeeNumber());
         assertTrue(success);
        System.out.println("Deleted: " + success);
        System.out.println(" ");
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println("Display All: ");
        System.out.println(repository.getAll());
        System.out.println(" ");
    }
}