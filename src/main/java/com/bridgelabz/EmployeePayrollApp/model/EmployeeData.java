package com.bridgelabz.EmployeePayrollApp.model;

import com.bridgelabz.EmployeePayrollApp.Dto.EmployeeDto;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class EmployeeData {
    @ElementCollection
    @CollectionTable(name = "emp_Dept",joinColumns = @JoinColumn(name = "empId"))
    private List<String> department;
    @Id
    @GeneratedValue
    private long emp_id;
    private String name;
    private double salary;

    private String gender;
    private  String profilePic;

    private LocalDate startDate;

    private String note;

    private String phoneNumber;
    public EmployeeData(EmployeeDto empDto) {
        this.updateEmpData(empDto);
    }
    public void updateEmpData(EmployeeDto empData){
        this.name=empData.getName();
        this.salary= empData.getSalary();
        this.gender=empData.getGender();
        this.note= empData.getNote();
        this.phoneNumber=empData.getPhoneNumber();
        this.department=empData.getDepartment();
        this.profilePic= empData.getProfilePic();
        this.startDate=empData.getStartDate();
    }

}
