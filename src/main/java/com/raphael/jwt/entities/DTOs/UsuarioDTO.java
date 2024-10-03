package com.raphael.jwt.entities.DTOs;

import com.raphael.jwt.entities.enums.Role;
import jakarta.validation.constraints.*;

public record UsuarioDTO(
        @NotBlank(message = "O login não pode ser vazio")
        @NotNull(message = "O campo login é obrigatório")
        @Email(message = "Deve ser inserido um email valido")
        @Size(max = 255, message = "O email não pode ter mais de 255 caracteres")
        String login,

        @NotBlank(message = "A senha não pode ser vazia")
        @NotNull(message = "O campo senha é obrigatório")
        @Size(max = 255, message = "A senha não pode ter mais de 255 caracteres")
        @Pattern(
                regexp = "^(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"|,.<>/?]).+$",
                message = "A senha deve conter pelo menos um caractere especial"
        )
        String senha,

        @NotNull(message = "O papel do usuário é obrigatório")
        Role role
) {}
