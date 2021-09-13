package ua.lviv.iot.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.employeemanager.model.Employee;

import java.util.*;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
