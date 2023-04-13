package com.bridgelabz.EmployeePayrollApp.model;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class EmployeeData {
    @Id
    @GeneratedValue
    private long emp_id;
    private String name;
    private double salary;

    public EmployeeData(EmployeeDto employeeDto){
        this.name=employeeDto.getName();
        this.salary=employeeDto.getSalary();
    }

}
