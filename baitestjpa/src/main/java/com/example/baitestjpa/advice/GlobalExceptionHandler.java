package com.example.baitestjpa.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerException(MethodArgumentNotValidException exception) {
        Map<String, String> map = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(
                message -> map.put(message.getField(), message.getDefaultMessage())
        );
        return map;
    }

}
