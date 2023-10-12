package com.example.duanthuctap.service.impl;

import com.example.duanthuctap.dto.request.LoginRequest;
import com.example.duanthuctap.dto.request.RegisterRequest;
import com.example.duanthuctap.dto.response.MessageResponse;
import com.example.duanthuctap.dto.response.TokenResponse;
import com.example.duanthuctap.entity.Account;
import com.example.duanthuctap.entity.Decentralization;
import com.example.duanthuctap.jwt.JwtService;
import com.example.duanthuctap.model.UserDetailsCustom;
import com.example.duanthuctap.repository.AccountRepository;
import com.example.duanthuctap.repository.DecentralizationRepository;
import com.example.duanthuctap.service.UserService;
import com.example.duanthuctap.until.CodeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DecentralizationRepository decentralizationRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public TokenResponse login(LoginRequest loginRequest) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequest.getUsername(),
                loginRequest.getPassword()));
        Optional<Account> findByUsername = accountRepository.findByUserName(loginRequest.getUsername());
        if (findByUsername.isPresent()) {
            Account refreshToken = updateToken(loginRequest.getUsername());
            String jwtToken = jwtService.generateToken(new UserDetailsCustom(findByUsername.get()));
            return TokenResponse
                    .builder()
                    .accessToken(jwtToken)
                    .token(refreshToken.getResetPasswordToken())
                    .role(findByUsername.get().getDecentralization().getAuthorityName().name())
                    .message("Login Thành Công")
                    .build();
        } else {
            return TokenResponse.builder()
                    .message("Sai username hoặc password")
                    .build();
        }
    }

    @Override
    public MessageResponse register(RegisterRequest registerRequest) {
        Optional<Account> optionalPhatTu = accountRepository.findByUserName(registerRequest.getUsername());

        if (optionalPhatTu.isPresent()) {
            return MessageResponse.builder().message("Tài khoản đã tồn tại").build();
        }

        Optional<Decentralization> quyenHan = decentralizationRepository.findByAuthorityName(registerRequest.getAuthorityName());

        if (quyenHan.isEmpty()) {
            return MessageResponse.builder().message("Quyền hạn không hợp lệ").build();
        }
        System.out.println("Mã Mới Là: " + registerRequest.getConfirmCode().toString());
        if (!registerRequest.getConfirmCode().equalsIgnoreCase(registerRequest.getCode())) {
            return MessageResponse.builder().message("Mã xác nhận không chính xác").build();
        }

        Account account = Account
                .builder()
                .userName(registerRequest.getUsername())
                .password(passwordEncoder.encode(registerRequest.getPassword()))
                .email(registerRequest.getEmail())
                .decentralization(quyenHan.get())
                .confirmCode(registerRequest.getConfirmCode())
                .build();
        try {
            accountRepository.save(account);
            return MessageResponse.builder().message("Registered Successfully").build();
        } catch (Exception e) {
            return MessageResponse.builder().message("Lỗi trong quá trình đăng ký").build();
        }
    }

    @Override
    public Account updateToken(String username) {
        Optional<Account> findByUsername = accountRepository.findByUserName(username);
        findByUsername.get().setResetPasswordToken(UUID.randomUUID().toString());
        findByUsername.get().setResetPasswordTokenExpiry(LocalDate.from(LocalDateTime.now().plusMinutes(600000)));
        return accountRepository.save(findByUsername.get());
    }

    public Optional<Account> findByToken(String token) {
        return accountRepository.findByResetPasswordToken(token);
    }

    public Account verifyExpiration(Account resetPasswordToken) {
        if (resetPasswordToken.getResetPasswordTokenExpiry().compareTo(ChronoLocalDate.from(Instant.now())) < 0) {
            accountRepository.delete(resetPasswordToken);
            throw new RuntimeException(resetPasswordToken.getResetPasswordToken() + " Refresh token was expired. Please make a new signin request");
        }
        return resetPasswordToken;
    }

    @Override
    public MessageResponse sendConfirmEmail(RegisterRequest registerRequest) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(registerRequest.getEmail());
        simpleMailMessage.setSubject("Xác nhận đăng ký tài khoản");
        String confirmationCode = confirmationCode();
        simpleMailMessage.setText("Mã xác nhận của bạn là   " + confirmationCode);
        javaMailSender.send(simpleMailMessage);
        registerRequest.setConfirmCode(confirmationCode);
        return MessageResponse.builder().message("Send mã thành công").build();
    }

    @Override
    public String confirmationCode() {
        return CodeGenerator.generateRandomCode(6);
    }
}
