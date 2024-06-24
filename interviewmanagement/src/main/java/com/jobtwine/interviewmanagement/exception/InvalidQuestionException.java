package com.jobtwine.interviewmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidQuestionException extends RuntimeException {
    public InvalidQuestionException(String message) {
        super(message);
    }
}
