package com.eduardoguedes.confeitaria.entity.brand;

import jakarta.validation.constraints.NotBlank;

public record MarcaRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String nome
) {}
