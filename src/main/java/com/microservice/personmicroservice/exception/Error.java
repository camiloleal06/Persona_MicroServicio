package com.microservice.personmicroservice.exception;

public class Error {

    private final String nameException;
    private final String message;

    public Error(String nameException, String message) {
        this.nameException = nameException;
        this.message = message;
    }

    public String getNameException() {
        return nameException;
    }

    public String getMessage() {
        return message;
    }

}