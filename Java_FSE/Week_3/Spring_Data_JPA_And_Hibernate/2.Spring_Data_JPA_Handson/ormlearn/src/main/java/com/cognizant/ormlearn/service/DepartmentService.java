package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.entity.Department;
import com.cognizant.ormlearn.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Department get(int id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Department department) {
        repository.save(department);
    }
}