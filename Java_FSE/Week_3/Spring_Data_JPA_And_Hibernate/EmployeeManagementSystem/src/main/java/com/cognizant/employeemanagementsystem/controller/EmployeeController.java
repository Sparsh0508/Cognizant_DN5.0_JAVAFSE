package com.cognizant.employeemanagementsystem.controller;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Create Employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get Employee By Id
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Update Employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id,
                                   @RequestBody Employee employee) {

        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return "Employee Deleted Successfully";
    }

    // Derived Query

    @GetMapping("/name/{name}")
    public List<Employee> findByName(@PathVariable String name) {
        return employeeService.findByName(name);
    }

    @GetMapping("/email/{email}")
    public Employee findByEmail(@PathVariable String email) {
        return employeeService.findByEmail(email);
    }

// @Query

    @GetMapping("/query/name/{name}")
    public List<Employee> searchByName(@PathVariable String name) {
        return employeeService.searchByName(name);
    }

    @GetMapping("/query/email/{email}")
    public Employee searchByEmail(@PathVariable String email) {
        return employeeService.searchByEmail(email);
    }

// Named Query

    @GetMapping("/named/name/{name}")
    public List<Employee> namedName(@PathVariable String name) {
        return employeeService.findByEmployeeName(name);
    }

    @GetMapping("/named/email/{email}")
    public Employee namedEmail(@PathVariable String email) {
        return employeeService.findByEmployeeEmail(email);
    }

    @GetMapping("/page")
    public Page<Employee> getEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

        Pageable pageable = PageRequest.of(page, size);

        return employeeService.getEmployees(pageable);
    }

    @GetMapping("/sort")
    public List<Employee> sortEmployees(
            @RequestParam(defaultValue = "name") String field) {

        return employeeService.getEmployeesSorted(field);
    }

    @GetMapping("/page-sort")
    public Page<Employee> pageSort(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size,
            @RequestParam(defaultValue = "name") String sortBy) {

        Pageable pageable = PageRequest.of(page, size,
                org.springframework.data.domain.Sort.by(sortBy));

        return employeeService.getEmployeesWithPaginationAndSorting(pageable);
    }

    @GetMapping("/projection")
    public List<EmployeeProjection> getProjection() {
        return employeeService.getEmployeeProjection();
    }
}