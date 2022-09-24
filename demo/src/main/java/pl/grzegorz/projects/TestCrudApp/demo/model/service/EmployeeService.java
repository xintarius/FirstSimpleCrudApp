package pl.grzegorz.projects.TestCrudApp.demo.model.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.grzegorz.projects.TestCrudApp.demo.model.entity.Employee;
import pl.grzegorz.projects.TestCrudApp.demo.model.exception.UserNotFoundException;
import pl.grzegorz.projects.TestCrudApp.demo.model.repository.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    public List<Employee> findAllEmployees;
    //Crud

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
        findAllEmployees = new ArrayList<>();
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public Employee findEmployeeById(Long id){
        return employeeRepo.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id" + " " + id + " " + " was not found"));
    }
    public Employee UpdateEmployee(Employee employee){
         return employeeRepo.save(employee);
    }
    public void deleteEmployee(Long id){
        employeeRepo.deleteEmployeeById(id);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
}
