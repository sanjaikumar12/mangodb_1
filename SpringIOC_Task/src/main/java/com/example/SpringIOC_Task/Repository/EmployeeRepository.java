package com.example.SpringIOC_Task.Repository;

import com.example.SpringIOC_Task.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEmployeeId(String employeeId);
}
