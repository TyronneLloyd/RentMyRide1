package za.ac.cput.service;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 27 July 2021
*/

import za.ac.cput.entity.Employee;
import za.ac.cput.repository.employee.EmployeeRepository;
import za.ac.cput.service.employee.IEmployeeService;

import java.util.Set;

public class EmployeeService implements IEmployeeService{
    private static  EmployeeService service = null;
    private EmployeeRepository repository = null;

    private EmployeeService(){this.repository = EmployeeRepository.getRepository();}

    public static EmployeeService getService(){
        if(service == null){
            service = new EmployeeService();
        }
        return service;
    }
    @Override
    public Employee create(Employee employee){return this.repository.create(employee);}

    @Override
    public Employee read(String employeeID){return this.repository.read(employeeID);}

    @Override
    public Employee update(Employee employee){return this.repository.update(employee);}

    @Override
    public boolean delete(String employeeID){return this.repository.delete(employeeID);}

    @Override
    public Set<Employee> getAll(){return  this.repository.getAll();}


}
