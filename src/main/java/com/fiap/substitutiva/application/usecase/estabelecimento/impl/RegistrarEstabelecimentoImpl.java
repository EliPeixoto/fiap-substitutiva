package com.fiap.substitutiva.application.usecase.estabelecimento.impl;

import com.fiap.substitutiva.application.usecase.endereco.BuscarEnderecoPorIdEstabelecimento;
import com.fiap.substitutiva.application.usecase.estabelecimento.BuscarEstabelecimentoPorId;
import com.fiap.substitutiva.application.usecase.estabelecimento.RegistrarEstabelecimento;
import com.fiap.substitutiva.domain.entities.Estabelecimento;
import com.fiap.substitutiva.domain.repositories.EstabelecimentoRepository;

import java.util.NoSuchElementException;
import java.util.Objects;

public class RegistrarEstabelecimentoImpl implements RegistrarEstabelecimento {
    private final EstabelecimentoRepository estabelecimentoRepository;
    private final BuscarEnderecoPorIdEstabelecimento buscarEnderecoPorIdEstabelecimento;

    public RegistrarEstabelecimentoImpl(EstabelecimentoRepository estabelecimentoRepository,
                                        BuscarEnderecoPorIdEstabelecimento buscarEnderecoPorIdEstabelecimento) {
        this.estabelecimentoRepository = estabelecimentoRepository;
        this.buscarEnderecoPorIdEstabelecimento = buscarEnderecoPorIdEstabelecimento;
    }

    @Override
    public Estabelecimento registrarEstabelecimento(Estabelecimento estabelecimento) {
        if (estabelecimentoRepository.existePorId(estabelecimento.getId())) {
            throw new IllegalStateException("Estabelecimento já registrado");
        }
        if (Objects.isNull(buscarEnderecoPorIdEstabelecimento.buscarPorIdEstabelecimento(estabelecimento.getId()))) {
            throw new IllegalStateException("Informe um id de endereço existente");
        }
        return estabelecimentoRepository.salvar(estabelecimento);
    }
}
