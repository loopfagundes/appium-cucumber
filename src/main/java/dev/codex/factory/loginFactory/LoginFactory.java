package dev.codex.factory.loginFactory;

import dev.codex.dto.loginDTO.LoginDTO;

public class LoginFactory {
    public static LoginDTO loginDto() {
        return new LoginDTO(
                "standard_user",
                "secret_sauce"
        );
    }
}