package com.example.exceptions;

/**
 * @author Ravi Panchal
 */
public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message) {
        super(message);
    }

    public MovieNotFoundException(Throwable cause) {
        super(cause);
    }

    public MovieNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
