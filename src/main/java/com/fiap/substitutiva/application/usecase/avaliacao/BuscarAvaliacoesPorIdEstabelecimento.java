package com.fiap.substitutiva.application.usecase.avaliacao;

import com.fiap.substitutiva.domain.entities.Avaliacao;

import java.util.List;

public interface BuscarAvaliacoesPorIdEstabelecimento {
    List<Avaliacao> buscarPorIdEstabelecimento(Long idEstabelecimento);
}
