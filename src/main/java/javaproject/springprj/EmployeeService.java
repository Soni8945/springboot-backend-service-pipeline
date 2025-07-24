package javaproject.springprj;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private final UserRepository repository;

    public EmployeeService(UserRepository repository) {
        this.repository = repository;
    }

    public employees getEmployeeById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public employees createEmployee(employees employee) {
        return repository.save(employee);
    }
}