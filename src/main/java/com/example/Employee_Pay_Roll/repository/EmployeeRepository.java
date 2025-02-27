package com.example.Employee_Pay_Roll.repository;

import com.example.Employee_Pay_Roll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

