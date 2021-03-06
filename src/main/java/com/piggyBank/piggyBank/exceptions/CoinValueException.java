package com.piggyBank.piggyBank.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CoinValueException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = -2812190201200119620L;

    public CoinValueException(String message) {
        super(message);
    }
}