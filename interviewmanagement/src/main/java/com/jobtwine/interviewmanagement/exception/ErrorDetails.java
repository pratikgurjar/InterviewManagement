package com.jobtwine.interviewmanagement.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorDetails {
    private String message;
    private String details;

    public ErrorDetails(String message, String details) {
        this.message = message;
        this.details = details;
    }

}

