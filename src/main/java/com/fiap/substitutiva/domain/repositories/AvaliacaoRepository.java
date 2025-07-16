package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Avaliacao;

import java.util.List;
import java.util.Optional;

public interface AvaliacaoRepository {
    Avaliacao save(Avaliacao avaliacao);
    Optional<Avaliacao> findById(Long id);
    List<Avaliacao> findAll();
    List<Avaliacao> findByAgendamentoId(Long agendamentoId);
}
