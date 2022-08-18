package com.example.hospital.exception;

public class BadRequest extends Throwable {
    public BadRequest(String no_existen_doctores) {
        System.out.println(no_existen_doctores);
    }
}
