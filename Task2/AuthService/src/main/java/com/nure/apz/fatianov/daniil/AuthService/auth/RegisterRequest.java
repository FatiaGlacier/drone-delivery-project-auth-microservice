package com.nure.apz.fatianov.daniil.AuthService.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private Date birthday;
    private String gender;
}
