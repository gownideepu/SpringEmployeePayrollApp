package com.bridgelabz.EmployeePayrollApp.Controller;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.Dto.ResponseDto;
import com.bridgelabz.EmployeePayrollApp.EmployeeService.MyEmployeeService;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private MyEmployeeService employeeService;
    @PostMapping("/add")
    public ResponseDto addEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeData employeeData = employeeService.addEmployee(employeeDto);
        ResponseDto responseDto=new ResponseDto("data added successfully",employeeData);
        return responseDto;
    }
}
