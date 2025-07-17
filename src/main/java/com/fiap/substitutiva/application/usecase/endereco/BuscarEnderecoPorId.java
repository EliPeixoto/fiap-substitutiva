package com.fiap.substitutiva.application.usecase.endereco;

import com.fiap.substitutiva.domain.entities.Endereco;

public interface BuscarEnderecoPorId {
    Endereco buscarEnderecoPorId(Long id);
}
