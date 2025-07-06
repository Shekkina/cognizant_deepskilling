package com.example.employee.service;



import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Page<Employee> getAllPaged(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    public List<Employee> getByName(String name) {
        return employeeRepository.findByName(name);
    }
}
