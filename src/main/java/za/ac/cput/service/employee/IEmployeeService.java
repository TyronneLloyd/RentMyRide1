package za.ac.cput.service.employee;

import za.ac.cput.entity.Employee;
import za.ac.cput.service.IService;

import java.util.Set;

/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 27 July 2021
*/
public interface IEmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
