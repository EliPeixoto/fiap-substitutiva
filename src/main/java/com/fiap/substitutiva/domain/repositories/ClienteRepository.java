package com.fiap.substitutiva.domain.repositories;

import com.fiap.substitutiva.domain.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    Optional<Cliente> findById(Long id);
    List<Cliente> findAll();
    Optional<Cliente> findByNome(String nome);
}
