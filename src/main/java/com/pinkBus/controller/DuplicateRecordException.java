package com.pinkBus.controller;

public class DuplicateRecordException extends RuntimeException {

    public DuplicateRecordException(String message) {
        super(message);
    }
}
