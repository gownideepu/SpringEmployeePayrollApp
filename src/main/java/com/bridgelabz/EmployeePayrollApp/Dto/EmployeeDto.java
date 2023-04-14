package com.bridgelabz.EmployeePayrollApp.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public class EmployeeDto {
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message = "The Name is notEmpty")

    private String name;

    @Min(value = 400,message = "The minumum salary shoud be >400")

    private double salary;

}
