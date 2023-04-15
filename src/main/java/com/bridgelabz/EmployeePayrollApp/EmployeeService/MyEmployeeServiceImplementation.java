package com.bridgelabz.EmployeePayrollApp.EmployeeService;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.Repository.EmployeeRepository;
import com.bridgelabz.EmployeePayrollApp.exception.EmployeeCustomException;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public EmployeeData getEmployeeById(int id){
       return employeeRepository.findById(id).orElseThrow(() -> new EmployeeCustomException(" Employee Not found .. wih id: "+ id));

    }

    @Override
    public List<EmployeeData> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public void delete(int id) {
        EmployeeData empData=this.getEmployeeById(id);
        employeeRepository.delete(empData);
    }

    @Override
    public EmployeeData UpdateEmployee(int id, EmployeeDto empDto) {
        return null;
    }
}
