package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Profissional;

import java.util.List;
import java.util.Optional;

public interface ProfissionalRepository {
    Profissional save(Profissional profissional);
    Optional<Profissional> findById(Long id);
    List<Profissional> findAll();
    List<Profissional> findByEspecialidade(String especialidade);
}
