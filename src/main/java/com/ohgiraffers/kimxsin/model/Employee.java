// src/main/java/com/example/chatapp/model/Employee.java
package com.ohgiraffers.kimxsin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @Column(name = "emp_code") // DB의 컬럼명과 매핑
    private String empCode; // 사원 코드

    private String name; // 사원 이름
}
