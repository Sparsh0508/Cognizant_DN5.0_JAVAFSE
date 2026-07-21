package com.cognizant.employeemanagementsystem.repository;

import com.cognizant.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cognizant.employeemanagementsystem.projection.EmployeeProjection;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<EmployeeProjection> findAllProjectedBy();
    List<Employee> findByName(String name);
    Employee findByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    List<Employee> searchByName(@Param("name") String name);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee searchByEmail(@Param("email") String email);

    @Query(name = "Employee.findByEmployeeName")
    List<Employee> findByEmployeeName(@Param("name") String name);

    @Query(name = "Employee.findByEmployeeEmail")
    Employee findByEmployeeEmail(@Param("email") String email);
}