package za.ac.cput.repository.employee;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 19 July 2021
*/
import za.ac.cput.entity.Employee;
import za.ac.cput.repository.IRepository;
import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
