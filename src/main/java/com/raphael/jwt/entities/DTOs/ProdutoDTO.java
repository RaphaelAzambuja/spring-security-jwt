package com.raphael.jwt.entities.DTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProdutoDTO(
        @NotBlank(message = "O nome não pode ser vazio")
        @NotNull(message = "O campo nome é obrigatório")
        @Size(max = 255, message = "O nome deve ter no máximo 255 caracteres")
        String nome,

        @NotBlank(message = "A descrição não pode ser vazia")
        @NotNull(message = "O campo descrição é obrigatório")
        @Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
        String descricao,

        @NotNull(message = "O preço não pode ser nulo")
        @Min(value = 0, message = "O preço deve ser um valor positivo")
        Double preco
) {
}
