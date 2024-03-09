package com.example.Authentication.AuthenticationProject.Helpers;

import com.example.Authentication.AuthenticationProject.Entity.Gender;
import com.example.Authentication.AuthenticationProject.Entity.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private Gender gender;
    private String phoneNumber;
    private Role role;
}
