package br.com.fiap.concessionaria.dto.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CaracteristicaRequest(


        @NotNull(message = "O  veiculo é obrigatório")
        AbstractRequest veiculo,



        @NotNull(message = "O nome é obrigatório")
        String nome,


        @NotNull(message = "A descriçao é obrigatória")
        String descricao


) {
}