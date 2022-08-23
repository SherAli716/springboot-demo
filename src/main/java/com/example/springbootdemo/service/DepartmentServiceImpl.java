package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Department;
import com.example.springbootdemo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long depId) {
        return departmentRepository.findById(depId).get();
    }

    @Override
    public void deleteDepartmentById(Long depId) {
        departmentRepository.deleteById((depId));
    }

    @Override
    public Department updateDepartment(Long depId, Department department) {
        Department depDB=departmentRepository.findById(depId).get();

        if(Objects.nonNull(department.getDepName()) && //if not null and not blank then set the value
            !"".equalsIgnoreCase(department.getDepName())){
                depDB.setDepName(department.getDepName());
        }

        if(Objects.nonNull(department.getDepCode()) && //if not null and not blank then set the value
                !"".equalsIgnoreCase(department.getDepCode())){
            depDB.setDepCode(department.getDepCode());
        }


        return departmentRepository.save(depDB);
    }

    @Override
    public Department fetchDepartmentByName(String depName) {
        return departmentRepository.findByDepName(depName);
    }

}





