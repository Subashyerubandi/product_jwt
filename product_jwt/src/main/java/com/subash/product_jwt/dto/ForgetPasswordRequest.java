package com.subash.product_jwt.dto;

import lombok.Data;

@Data
public class ForgetPasswordRequest {
	private String newPassword;
    private String confirmNewPassword;
}
