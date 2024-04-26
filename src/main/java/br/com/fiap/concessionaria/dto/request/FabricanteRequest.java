package br.com.fiap.concessionaria.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record FabricanteRequest(

        @Size(min = 3, max = 180, message = "A quantidade de caracteres do nome deve estar entre 3 e 180")
        @NotNull(message = "O nome é  obrigatório")
        String nome,

        @Size(min = 3, max = 180, message = "A quantidade de caracteres do nome deve estar entre 3 e 180")
        @NotNull(message = "O nome fantasia é  obrigatório")
        String nomeFantasia

) {
}