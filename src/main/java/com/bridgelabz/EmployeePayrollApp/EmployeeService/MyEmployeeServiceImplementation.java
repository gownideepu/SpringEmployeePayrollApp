package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.Repository.EmployeeRepository;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyEmployeeServiceImplementation implements MyEmployeeService {
    List<EmployeeData> list=new ArrayList<>();
    @Autowired
private EmployeeRepository employeeRepository;
    @Override
    public EmployeeData addEmployee(EmployeeDto employeeDto) {
        EmployeeData employeeData=new EmployeeData(employeeDto);
        list.add(employeeData);
        return employeeRepository.save(employeeData);
    }
    @Override
    public Optional<EmployeeData> getEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    @Override
    public List<EmployeeData> getAllEmployee() {
        return employeeRepository.findAll();
    }
}
