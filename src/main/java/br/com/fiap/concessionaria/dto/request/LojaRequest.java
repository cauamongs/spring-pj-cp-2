package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LojaRequest(

        @NotNull(message = "O nome é obrigatório")
        String nome
) {
}