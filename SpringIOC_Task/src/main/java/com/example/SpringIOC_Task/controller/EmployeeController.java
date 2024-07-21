package com.example.SpringIOC_Task.controller;

import com.example.SpringIOC_Task.Repository.EmployeeRepository;
import com.example.SpringIOC_Task.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/display/{employeeId}")
    public Employee getEmployeeById(@PathVariable String employeeId) {
        return employeeRepository.findByEmployeeId(employeeId);
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
