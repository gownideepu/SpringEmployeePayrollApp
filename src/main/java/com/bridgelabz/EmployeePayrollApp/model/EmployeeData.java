package com.bridgelabz.EmployeePayrollApp.model;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmployeeData {
    public EmployeeData() {
    }
    @Id
    @GeneratedValue
    private long emp_id;
    private String name;
    private double salary;

    public EmployeeData(EmployeeDto employeeDto){
        this.name=employeeDto.name;
        this.salary=employeeDto.salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }


}
