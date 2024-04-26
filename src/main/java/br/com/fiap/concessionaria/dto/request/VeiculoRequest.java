package br.com.fiap.concessionaria.dto.request;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.Year;

public record VeiculoRequest(


        @NotNull(message = "O nome é obrigatório")
        String nome,

        @NotNull(message = "O preço é obrigatório")
        Double preco,

        @NotNull(message = "O modelo é obrigatório")
        String modelo,

        @DateTimeFormat(pattern = "yyyy")
        @NotNull(message = "O ano de fabricação é obrigatório")
        Year anoDeFabricacao,

        @NotNull(message = "A cor é obrigatório")
        String cor,

        @NotNull(message = "A cilindradas é obrigatório")
        Short cilindradas,

        @Size(min = 3, max = 15)
        @NotNull(message = "A palavra é obrigatório")
        String palavraDeEfeito,
        @Valid
        @NotNull(message = "Os dados do fabricante é obrigatório")
        AbstractRequest fabricante,
        @Valid
        @NotNull(message = "Os dados do tipo de veiculo é obrigatório")
        AbstractRequest tipo



) {
}