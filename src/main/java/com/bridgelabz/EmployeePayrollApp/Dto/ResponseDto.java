package com.bridgelabz.EmployeePayrollApp.Dto;

import com.bridgelabz.EmployeePayrollApp.model.EmployeeData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
public class ResponseDto {
  public Object data;
  public String message;

    public ResponseDto(String message, Object data) {
      this.data=data;
      this.message=message;

    }
}
