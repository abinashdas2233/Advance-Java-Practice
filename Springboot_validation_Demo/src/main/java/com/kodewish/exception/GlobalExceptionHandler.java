package com.kodewish.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleExceptionForNull(MethodArgumentNotValidException ex) {
        Map<String, String> hm = new HashMap<>();
        ex.getAllErrors().forEach(e -> {
            String field = ((FieldError) e).getField(); //it fetch on which field error occur
            String message = e.getDefaultMessage();//it fetch the error message
            hm.put(field, message);
        }

        );
        return hm;
    }
}
