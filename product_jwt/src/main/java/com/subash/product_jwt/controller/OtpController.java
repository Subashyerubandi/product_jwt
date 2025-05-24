package com.subash.product_jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subash.product_jwt.service.OtpService;

@RestController
@RequestMapping("/api/otp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    @PostMapping("/mobile")
    public ResponseEntity<String> sendOtp(@RequestParam String mobile) {
        otpService.generateOtpForMobile(mobile);
        return ResponseEntity.ok("OTP sent (check console)");
    }

    @PostMapping("/verify")
    public ResponseEntity<String> verifyOtp(@RequestParam String mobile, @RequestParam String otp) {
        boolean valid = otpService.validateOtpForMobile(mobile, otp);
        return valid ? ResponseEntity.ok("OTP Verified") : ResponseEntity.status(400).body("Invalid OTP");
    }

    @PostMapping("/email")
    public ResponseEntity<String> sendOtpToMail(@RequestParam String email) {
        otpService.generateOtpForEmail(email);
        return ResponseEntity.ok("OTP sent (check console)");
    }

    @PostMapping("/validate")
    public ResponseEntity<String> validateOtp(@RequestParam String email, @RequestParam String otp) {
        boolean isValid = otpService.validateOtpForEmail(email, otp);
        return isValid ? ResponseEntity.ok("OTP Verified") : ResponseEntity.status(400).body("Invalid OTP");
    }
}
