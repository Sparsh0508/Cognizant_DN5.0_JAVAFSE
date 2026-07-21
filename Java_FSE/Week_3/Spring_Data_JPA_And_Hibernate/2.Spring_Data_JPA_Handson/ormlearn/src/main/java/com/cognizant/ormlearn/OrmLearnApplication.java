package com.cognizant.ormlearn;

import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cognizant.ormlearn.entity.Department;
import com.cognizant.ormlearn.entity.Employee;

import java.time.LocalDate;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StockRepository stockRepository;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private SkillService skillService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        handsOn1();
        handsOn2();
        handsOn3();

         handsOn4();

    }

    private void handsOn1() {

        System.out.println("\nSearch containing 'ou'");

        countryRepository.findByNameContaining("ou")
                .forEach(System.out::println);

        System.out.println("\nSearch containing 'ou' (Sorted)");

        countryRepository.findByNameContainingOrderByNameAsc("ou")
                .forEach(System.out::println);

        System.out.println("\nCountries starting with 'Z'");

        countryRepository.findByNameStartingWith("Z")
                .forEach(System.out::println);
    }


    private void handsOn2() {


        System.out.println("\nFacebook Stocks (September 2019)");

        stockRepository.findByCodeAndDateBetween(
                        "FB",
                        LocalDate.of(2019, 9, 1),
                        LocalDate.of(2019, 9, 30))
                .forEach(System.out::println);

        System.out.println("\nGoogle Stocks (Close > 1250)");

        stockRepository.findByCodeAndCloseGreaterThan(
                        "GOOGL",
                        1250.0)
                .forEach(System.out::println);

        System.out.println("\nTop 3 Highest Volume");

        stockRepository.findTop3ByOrderByVolumeDesc()
                .forEach(System.out::println);

        System.out.println("\nLowest 3 Netflix Stocks");

        stockRepository.findTop3ByCodeOrderByCloseAsc("NFLX")
                .forEach(System.out::println);
    }

    private void handsOn3() {

        System.out.println("EmployeeService Bean : " + employeeService);

        System.out.println("DepartmentService Bean : " + departmentService);

        System.out.println("SkillService Bean : " + skillService);

        System.out.println("\nHands-on 3 Completed Successfully.");
    }

    private void handsOn4() {

        testGetEmployee();

        testAddEmployee();

        testUpdateEmployee();
    }


    private void testGetEmployee() {

        System.out.println("\n----- GET EMPLOYEE -----");

        Employee employee = employeeService.get(1);

        if (employee != null) {

            System.out.println(employee);

            System.out.println(employee.getDepartment());

        } else {

            System.out.println("Employee Not Found");
        }
    }

    private void testAddEmployee() {

        System.out.println("\n----- ADD EMPLOYEE -----");

        Department department = departmentService.get(1);

        if (department == null) {
            System.out.println("Department not found.");
            return;
        }

        Employee employee = new Employee();

        employee.setName("John");

        employee.setSalary(85000);

        employee.setPermanent(true);

        employee.setDateOfBirth(new java.util.Date());

        employee.setDepartment(department);

        employeeService.save(employee);

        System.out.println("Employee Added Successfully");
    }

    private void testUpdateEmployee() {

        System.out.println("\n----- UPDATE EMPLOYEE -----");

        Employee employee = employeeService.get(1);

        Department department = departmentService.get(2);

        if (employee == null || department == null) {

            System.out.println("Employee or Department not found.");

            return;
        }

        employee.setDepartment(department);

        employeeService.save(employee);

        System.out.println("Department Updated");
    }
}