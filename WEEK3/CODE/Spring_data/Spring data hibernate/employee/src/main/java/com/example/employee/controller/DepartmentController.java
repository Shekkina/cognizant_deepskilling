package com.example.employee.controller;

import com.example.employee.entity.Department;
import com.example.employee.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    @PostMapping
    public Department add(@RequestBody Department dept) {
        return service.save(dept);
    }

    @GetMapping
    public List<Department> getAll() {
        return service.getAll();
    }
}

