package com.subash.product_jwt.dto;

import lombok.Data;

@Data
public class PasswordChangeRequest {
	private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;
}
