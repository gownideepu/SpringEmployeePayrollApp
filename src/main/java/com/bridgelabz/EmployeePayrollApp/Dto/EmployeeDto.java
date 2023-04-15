package com.bridgelabz.EmployeePayrollApp.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeDto {
    @NotEmpty
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$",message = "The Name is notEmpty")
    private String name;
    @Min(value = 400,message = "The minumum salary shoud be >400")
    private double salary;
    @Pattern(regexp = "male|female|Male|Female",message = "The gender is not empty")
    private String gender;
    @NotBlank(message = "The profilepicnot empty")
    private  String profilePic;
    @NotEmpty(message = "The depaartment shoud not beempty")
    private List<String> department;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate;
    @NotBlank(message = "The note shoud be written")
    private String note;
    @NotEmpty(message = "The Phone number is not empty")
    private String phoneNumber;

}
