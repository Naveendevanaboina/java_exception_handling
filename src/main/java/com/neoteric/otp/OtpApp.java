package com.neoteric.otp;



public class OtpApp {
    public static void main(String[] args) {
        OtpService otpService = new OtpService();

        String userOtp1 = "654321";
        String userOtp2 = "123456";

        try {
            otpService.validateOtp(userOtp1);
        } catch (InvalidOtpException e) {
            System.out.println(e.getMessage());
        }

        try {
            otpService.validateOtp(userOtp2);
        } catch (InvalidOtpException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("🔒 OTP validation process completed.");
    }
}
