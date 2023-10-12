package com.example.duanthuctap.dto.request;

import com.example.duanthuctap.enums.VaiTroEnums;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterRequest {

    @NotBlank(message = "Không được để trống")
    private String username;

    @NotBlank(message = "Không được để trống")
    private String password;

    @NotBlank(message = "Không được để trống")
    private String email;

    private VaiTroEnums authorityName;

    private String confirmCode;

    private String code;

}
