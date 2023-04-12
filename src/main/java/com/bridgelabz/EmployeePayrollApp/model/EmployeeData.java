package com.bridgelabz.EmployeePayrollApp.model;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EmployeeData {
    public EmployeeData(EmployeeDto employeeDto) {
    }

    @Id
    @GeneratedValue
    private int emp_id;
    private String name;
    private double salary;

    public EmployeeData(EmployeeData employeeData){
        this.name=employeeData.name;
        this.salary=employeeData.salary;
    }

    public EmployeeData(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
