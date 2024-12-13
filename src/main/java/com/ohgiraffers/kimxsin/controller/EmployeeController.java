package com.ohgiraffers.kimxsin.controller;

import com.ohgiraffers.kimxsin.model.Employee;
import com.ohgiraffers.kimxsin.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); // DB에서 모든 직원 정보 가져오기
    }
}
