package com.trainee.colors.infrastructure.errors;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity notFound() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity notValid(MethodArgumentNotValidException notValidException) {
        var errors = notValidException.getFieldErrors().stream().map(NotValidField::new).toList();
        return ResponseEntity.badRequest().body(errors);
    }

    private record NotValidField(String field, String error) {

        public NotValidField(FieldError fieldError) {
            this(fieldError.getField(), fieldError.getDefaultMessage());
        }

    }

}
