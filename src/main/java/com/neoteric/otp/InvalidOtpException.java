package com.neoteric.otp;


public class InvalidOtpException extends Exception {
    public InvalidOtpException(String message) {
        super(message);
    }
}
