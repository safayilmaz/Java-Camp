package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.Employee.EmployeeRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Create get all employees api
    @GetMapping("employees")
    public List<Employee> geAllEmployees(){
        return  employeeRepository.findAll();
    }

    //Create employee
    @PostMapping("create-employee")
    public Employee createEmployee(Employee employee) throws ResourceNotFoundException{
        return employeeRepository.save(employee);
    }
    //Get employee by id
    @GetMapping("employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") int id) throws ResourceNotFoundException{
    Employee employee = employeeRepository.findById(id).orElseThrow(()->
            new ResourceNotFoundException("Employee not found for this id: "+id));
    return ResponseEntity.ok().body(employee);
    }

    //Update Employee
    @PutMapping("update-employee/id")
    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") int id, @RequestBody Employee employeeDetails){
        Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee could not update for this id: "+id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmail(employeeDetails.getEmail());
        employeeRepository.save(employee);
        return ResponseEntity.ok().body(employee);
    }
    //Delete Employee by id
    @DeleteMapping("delete-employee/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable(value = "id") int id)throws ResourceNotFoundException{
        employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found for this id: "+id));
        employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}