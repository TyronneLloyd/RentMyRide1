package za.ac.cput.repository.employee.impl;

import za.ac.cput.entity.Employee;
import za.ac.cput.repository.employee.IEmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository implements IEmployeeRepository {

    private static EmployeeRepository repository = null;
    private Set<Employee> employeeSet = null;

    private EmployeeRepository(){
        employeeSet = new HashSet<Employee>();
    }

    public static EmployeeRepository getRepository(){
        if(repository == null){
            repository = new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeSet.add(employee);
        if(!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String employeeId) {
        for (Employee e: employeeSet)
            if(e.getEmployeeNumber().equalsIgnoreCase(employeeId)){
                return e;
            }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if(oldEmployee != null){
            employeeSet.remove(oldEmployee);
            employeeSet.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeId) {
        Employee employeeRemoved = read(employeeId);
        if(employeeRemoved == null)
            return false;
        employeeSet.remove(employeeRemoved);
        return true ;
    }

    @Override
    public Set<Employee> getAll() {

        return null;
    }
}
