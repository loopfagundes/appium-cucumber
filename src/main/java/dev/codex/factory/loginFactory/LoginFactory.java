package dev.codex.factory.loginFactory;

import dev.codex.dto.loginDTO.LoginDTO;

public class LoginFactory {

    public static LoginDTO padraoUsuario() {
        return new LoginDTO(
                "standard_user",
                "secret_sauce"
        );
    }

    public static LoginDTO bugUsuario() {
        return new LoginDTO(
                "problem_user",
                "secret_sauce"
        );
    }
}