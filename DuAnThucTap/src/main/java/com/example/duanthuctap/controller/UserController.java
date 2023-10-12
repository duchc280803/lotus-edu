package com.example.duanthuctap.controller;

import com.example.duanthuctap.dto.request.LoginRequest;
import com.example.duanthuctap.dto.request.RegisterRequest;
import com.example.duanthuctap.dto.response.MessageResponse;
import com.example.duanthuctap.dto.response.TokenResponse;
import com.example.duanthuctap.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/account/")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("login")
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity<>(userService.login(loginRequest), HttpStatus.OK);
    }

    @PostMapping("register")
    public ResponseEntity<MessageResponse> register(@RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(userService.register(registerRequest), HttpStatus.CREATED);
    }

    @PostMapping("confirm-email")
    public ResponseEntity<MessageResponse> sendConfirmEmail(@RequestBody RegisterRequest registerRequest) {
        return new ResponseEntity<>(userService.sendConfirmEmail(registerRequest), HttpStatus.OK);
    }
}
