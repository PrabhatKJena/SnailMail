package com.ebay.method.exception;

public class InvalidOperationException extends RuntimeException {
    public InvalidOperationException() {
        super("Invalid Operation");
    }

}
