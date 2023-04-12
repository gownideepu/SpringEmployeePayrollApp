package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;

import java.util.List;
import java.util.Optional;

public interface MyEmployeeService {
    EmployeeData addEmployee(EmployeeDto employeeDto);

    Optional<EmployeeData> getEmployeeById(int id);

    List<EmployeeData> getAllEmployee();
}
