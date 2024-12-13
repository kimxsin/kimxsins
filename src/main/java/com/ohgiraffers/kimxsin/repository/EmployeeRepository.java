package com.ohgiraffers.kimxsin.repository;

import com.ohgiraffers.kimxsin.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
