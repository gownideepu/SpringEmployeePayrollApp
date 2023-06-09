package com.bridgelabz.EmployeePayrollApp.exception;


import com.bridgelabz.EmployeePayrollApp.Dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class EmployeeException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDto> handleMethodMethodArgumentNotValid(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errorMessage=errorList.stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());
        ResponseDto responceDto=new ResponseDto("Exception While handling Rest Api call ,",errorMessage);
        return  new ResponseEntity<>(responceDto, HttpStatus.BAD_REQUEST);

    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ResponseDto> HttpMessageNotReadableException(HttpMessageNotReadableException exception){
        ResponseDto responceDto=new ResponseDto("The Date shoid be in dd-mm-yyyy formate",exception.getMessage());
        return new ResponseEntity<>(responceDto, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(EmployeeCustomException.class)
    public ResponseEntity<ResponseDto> handleEmployeeException(EmployeeCustomException exception){
        ResponseDto responceDto=new ResponseDto("Exception While handling Rest Api call ,",exception.getMessage());
        return new ResponseEntity<>(responceDto, HttpStatus.BAD_REQUEST);
    }
}
