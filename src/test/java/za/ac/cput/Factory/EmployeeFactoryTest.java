package za.ac.cput.Factory;
/*
    @Description:Employees Entity ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 3rd June 2021
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Entity.Employee;

class EmployeeFactoryTest {
        @Test
        @Timeout(1)
        public void createEmployee(){
            Employee employee = EmployeeFactory.createEmployee("Ty","Lloyd", "admin","215141210","cput");
            assertNotNull(employee);
            System.out.println(employee);
    }


}//class