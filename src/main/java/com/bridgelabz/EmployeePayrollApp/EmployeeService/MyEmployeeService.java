package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;

public interface MyEmployeeService {
    EmployeeData addEmployee(EmployeeDto employeeDto);
}
