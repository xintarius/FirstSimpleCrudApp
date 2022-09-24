package pl.grzegorz.projects.TestCrudApp.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorz.projects.TestCrudApp.demo.model.entity.Employee;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long > {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
