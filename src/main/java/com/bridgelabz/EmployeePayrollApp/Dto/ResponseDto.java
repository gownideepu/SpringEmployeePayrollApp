package com.bridgelabz.EmployeePayrollApp.Dto;

public class ResponseDto {
    public Object data;
    public String message;
    public ResponseDto(String message,Object data){
        this.data=data;
        this.message=message;
    }
}
