package za.ac.cput.Factory;
/*
    @Description:Employees Entity ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 3rd June 2021
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Employee;

class EmployeeFactoryTest {
    @Test
    public void createEmployee(){
        Employee employee = EmployeeFactory.createEmployee("Ty","Lloyd", "admin","215141210","cput1");
        assertNotNull(employee);
        System.out.println(employee);
    }
    @Test
    @Disabled
    public void createEmployeeDisabledTest(){
        Employee employee = EmployeeFactory.createEmployee("Tyronne","Hendricks", "Sales","141202141","cput2");
        assertNotNull(employee.getName());
        assertNotNull(employee.getSurname());
        assertNotNull(employee.getUserType());
        assertNotNull(employee.getUsername());
        assertNotNull(employee.getPassword());
    }
    @Test
    public void createEmployeeObjectTest(){
        Employee employee = EmployeeFactory.createEmployee("Grant","Hendricks", "Sales","215138848","cput3");
        assertEquals("215138848",employee.getUsername());
    }
    @Test
    public void createEmployeeIdentityTest(){
        Employee employee = EmployeeFactory.createEmployee("Elrich","Herman", "Sales","218150040","cput4");
        assertSame("Elrich",employee.getName());
    }
    @Test
    @Timeout(10)
    public void createEmployeeTimeOutTest() throws InterruptedException{
        Thread.sleep(100);
        Employee employee = EmployeeFactory.createEmployee("Asiphiwe","Hanjiwe", "sales","218336675","cput5");
    }
}//class