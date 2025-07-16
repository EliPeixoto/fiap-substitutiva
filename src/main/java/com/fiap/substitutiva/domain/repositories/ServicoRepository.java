package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Servico;

import java.util.List;
import java.util.Optional;

public interface ServicoRepository {
    Servico save(Servico servico);
    Optional<Servico> findById(Long id);
    List<Servico> findAll();
    List<Servico> findByNome(String nome);
}
