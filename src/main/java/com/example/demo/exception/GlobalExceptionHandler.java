package com.example.demo.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handle(
            Exception e){

        return ResponseEntity.badRequest()
                .body(
                        Map.of(
                                "is_success",
                                false,
                                "message",
                                e.getMessage()
                        )
                );
    }
}