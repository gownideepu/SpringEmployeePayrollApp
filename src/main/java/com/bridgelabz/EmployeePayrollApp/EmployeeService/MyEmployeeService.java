package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;

import java.util.List;

public interface MyEmployeeService {
    EmployeeData addEmployee(EmployeeDto employeeDto);

    EmployeeData getEmployeeById(int id);

    List<EmployeeData> getAllEmployee();
    void delete(int id);
    EmployeeData UpdateEmployee(int id ,EmployeeDto empDto);
}
