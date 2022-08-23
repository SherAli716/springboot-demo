package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long depId);

    public void deleteDepartmentById(Long depId);

    public Department updateDepartment(Long depId, Department department);

    public Department fetchDepartmentByName(String depName);
}
