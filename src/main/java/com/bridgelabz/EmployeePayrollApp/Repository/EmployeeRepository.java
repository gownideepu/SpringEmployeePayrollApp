package com.bridgelabz.EmployeePayrollApp.Repository;

import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeData, Integer>{
}
