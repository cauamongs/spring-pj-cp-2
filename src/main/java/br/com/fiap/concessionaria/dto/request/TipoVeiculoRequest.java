package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoVeiculoRequest(

        @Size(min = 3, max = 100)
        @NotNull(message = "O nome é obrigatório")
        String nome
) {
}