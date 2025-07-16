package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Estabelecimento;

import java.util.List;
import java.util.Optional;

public interface EstabelecimentoRepository {

    Estabelecimento save(Estabelecimento e);
    Optional<Estabelecimento> findById(Long id);
    List<Estabelecimento> findAll();
}
