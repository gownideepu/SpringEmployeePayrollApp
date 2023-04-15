package com.bridgelabz.EmployeePayrollApp.Controller;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import com.bridgelabz.EmployeePayrollApp.Dto.ResponseDto;
import com.bridgelabz.EmployeePayrollApp.EmployeeService.MyEmployeeService;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private MyEmployeeService myEmployeeService;
    @PostMapping("/add")
    public ResponseDto addEmployee(@RequestBody EmployeeDto  employeeDto) {
        EmployeeData employeeData = myEmployeeService.addEmployee(employeeDto);
        ResponseDto responseDto=new ResponseDto("data added successfully",employeeData);
        return responseDto;
    }
    @GetMapping("/{id}")
    public ResponseDto getEmployeeById(@PathVariable int id){
       EmployeeData employeeData=myEmployeeService.getEmployeeById(id);
        ResponseDto responseDto=new ResponseDto("Employee Data added found",employeeData);
        return responseDto;
    }
    @GetMapping("/")
    public ResponseDto getAllEmployee(){
        List<EmployeeData> employeeData=myEmployeeService.getAllEmployee();
        ResponseDto responseDto=new ResponseDto("Employee Data added found",employeeData);
        return responseDto;
    }
}
