package med.voll.api.pacientedtos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {

}
