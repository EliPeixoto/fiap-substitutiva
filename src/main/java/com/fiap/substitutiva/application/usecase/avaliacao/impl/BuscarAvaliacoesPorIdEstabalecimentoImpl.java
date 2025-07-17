package com.fiap.substitutiva.application.usecase.avaliacao.impl;

import com.fiap.substitutiva.application.usecase.avaliacao.BuscarAvaliacoesPorIdEstabelecimento;
import com.fiap.substitutiva.domain.entities.Avaliacao;

import java.util.List;

public class BuscarAvaliacoesPorIdEstabalecimentoImpl {

    private final BuscarAvaliacoesPorIdEstabelecimento buscarAvaliacoesPorIdEstabelecimento;

    public BuscarAvaliacoesPorIdEstabalecimentoImpl(BuscarAvaliacoesPorIdEstabelecimento buscarAvaliacoesPorIdEstabelecimento) {
        this.buscarAvaliacoesPorIdEstabelecimento = buscarAvaliacoesPorIdEstabelecimento;
    }

    public List<Avaliacao> buscarporIdEstabelecimento(Long idEstabelecimento) {
        return buscarAvaliacoesPorIdEstabelecimento.buscarPorIdEstabelecimento(idEstabelecimento);
    }
}
