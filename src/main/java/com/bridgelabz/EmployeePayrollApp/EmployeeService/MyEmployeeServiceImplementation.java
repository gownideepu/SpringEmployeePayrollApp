package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.Repository.EmployeeRepository;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyEmployeeServiceImplementation implements MyEmployeeService {
    @Autowired
private EmployeeRepository employeeRepository;
    @Override
    public EmployeeData addEmployee(EmployeeDto employeeDto) {
        EmployeeData employeeData=new EmployeeData(employeeDto);
        return employeeRepository.save(employeeData);
    }
}
