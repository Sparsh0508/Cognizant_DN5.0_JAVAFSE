package com.cognizant.employeemanagementsystem.service;

import com.cognizant.employeemanagementsystem.entity.Employee;
import com.cognizant.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    public List<EmployeeProjection> getEmployeeProjection() {
        return employeeRepository.findAllProjectedBy();
    }

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create Employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get Employee By Id
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    // Update Employee
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Delete Employee
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    // Derived Query

    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

// @Query

    public List<Employee> searchByName(String name) {
        return employeeRepository.searchByName(name);
    }

    public Employee searchByEmail(String email) {
        return employeeRepository.searchByEmail(email);
    }

// Named Query

    public List<Employee> findByEmployeeName(String name) {
        return employeeRepository.findByEmployeeName(name);
    }

    public Employee findByEmployeeEmail(String email) {
        return employeeRepository.findByEmployeeEmail(email);
    }

    // Pagination
    public Page<Employee> getEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    // Sorting
    public List<Employee> getEmployeesSorted(String field) {
        return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    // Pagination + Sorting
    public Page<Employee> getEmployeesWithPaginationAndSorting(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
}