package com.subash.product_jwt.exception;

import java.time.LocalDateTime;

import com.subash.product_jwt.exception.ErrorResponse2;

import lombok.Data;

@Data
public class ErrorResponse2 {
    private String message;
    private int status;
    private LocalDateTime timestamp;

    public ErrorResponse2(String message, int status, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
    
}