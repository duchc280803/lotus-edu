package com.example.duanthuctap.service;

import com.example.duanthuctap.dto.request.LoginRequest;
import com.example.duanthuctap.dto.request.RegisterRequest;
import com.example.duanthuctap.dto.response.MessageResponse;
import com.example.duanthuctap.dto.response.TokenResponse;
import com.example.duanthuctap.entity.Account;

public interface UserService {

    TokenResponse login(LoginRequest loginRequest);

    MessageResponse register(RegisterRequest registerRequest);

    Account updateToken(String username);

    MessageResponse sendConfirmEmail(RegisterRequest registerRequest);

    String confirmationCode();
}
