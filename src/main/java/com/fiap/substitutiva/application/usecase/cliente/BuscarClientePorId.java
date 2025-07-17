package com.fiap.substitutiva.application.usecase.cliente;

import com.fiap.substitutiva.domain.entities.Cliente;

public interface BuscarClientePorId {
    Cliente buscarClientePorId(Long id);
}
