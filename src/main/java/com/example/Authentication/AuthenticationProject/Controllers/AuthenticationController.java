package com.example.Authentication.AuthenticationProject.Controllers;

import com.example.Authentication.AuthenticationProject.Helpers.AuthenticationRequest;
import com.example.Authentication.AuthenticationProject.Helpers.AuthenticationResponse;
import com.example.Authentication.AuthenticationProject.Helpers.RegisterRequest;
import com.example.Authentication.AuthenticationProject.Services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (@RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticationService.register(request));
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (@RequestBody AuthenticationRequest request){
        System.out.println("hello");
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
