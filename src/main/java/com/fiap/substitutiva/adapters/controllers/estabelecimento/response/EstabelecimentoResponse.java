package com.fiap.substitutiva.adapters.controllers.estabelecimento.response;

import com.fiap.substitutiva.adapters.controllers.endereco.response.EnderecoResponse;
import com.fiap.substitutiva.adapters.controllers.horario.response.HorarioResponse;

import java.util.List;

public class EstabelecimentoResponse {
    private Long id;
    private String nome;
    private EnderecoResponse endereco;
    private List<HorarioResponse> horarios;
}
