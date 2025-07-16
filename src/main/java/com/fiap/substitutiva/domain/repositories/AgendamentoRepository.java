package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Agendamento;

import java.util.List;
import java.util.Optional;

public interface AgendamentoRepository {
    Agendamento save(Agendamento agendamento);
    Optional<Agendamento> findById(Long id);
    List<Agendamento> findAll();
    List<Agendamento> findByProfissionalId(Long profissionalId);
    List<Agendamento> findByClienteId(Long clienteId);
}
