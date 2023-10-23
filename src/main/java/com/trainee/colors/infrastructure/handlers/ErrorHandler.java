package com.trainee.colors.infrastructure.handlers;

import com.trainee.colors.domain.entities.Color;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    // Using Aspect Oriented Programming

    // HTTP Status 404 : Not Found (Null Pointer)
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Color> notFound() {
        return ResponseEntity.notFound().build();
    }

    // HTTP Status 400 : Bad Request (When Validation doesnt Match)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<NotValidField>> notValid(MethodArgumentNotValidException notValidException) {
        var errors = notValidException.getFieldErrors().stream().map(NotValidField::new).toList();
        return ResponseEntity.badRequest().body(errors);
    }

    private record NotValidField(String field, String error) {

        public NotValidField(FieldError fieldError) {
            this(fieldError.getField(), fieldError.getDefaultMessage());
        }

    }

}
