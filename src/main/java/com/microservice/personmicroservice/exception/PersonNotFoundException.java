package com.microservice.personmicroservice.exception;

public class PersonNotFoundException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 43876691117560211L;

    public PersonNotFoundException(String mensaje) {
        super(mensaje);
    }
}