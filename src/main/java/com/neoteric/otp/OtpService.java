package com.neoteric.otp;



public class OtpService {
    private String systemOtp = "123456";

    public void validateOtp(String enteredOtp) throws InvalidOtpException {
        if (!enteredOtp.equals(systemOtp)) {
            throw new InvalidOtpException("❌ Invalid OTP entered. Please try again.");
        } else {
            System.out.println("✅ OTP Verified Successfully!");
        }
    }
}
