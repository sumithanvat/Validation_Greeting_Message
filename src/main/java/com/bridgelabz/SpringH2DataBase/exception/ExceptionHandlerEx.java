package com.bridgelabz.SpringH2DataBase.exception;

import com.bridgelabz.SpringH2DataBase.dto.ResponceDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

import static java.util.stream.StreamSupport.stream;

@ControllerAdvice
public class ExceptionHandlerEx {
    ExceptionHandler(MethodArgumentNotValidException.class)
        public ResponseEntity<ResponceDTO>handelMethodArgumentNotValidException(MethodArgumentNotValidException exception){

        List<ObjectError> errorList.stream()

        }

}
