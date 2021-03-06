package com.piggyBank.piggyBank.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ServicePathException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ServicePathException(String message) {
        super(message);
    }
}