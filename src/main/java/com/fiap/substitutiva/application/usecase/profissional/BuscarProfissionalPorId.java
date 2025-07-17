package com.fiap.substitutiva.application.usecase.profissional;

import com.fiap.substitutiva.domain.entities.Profissional;

public interface BuscarProfissionalPorId {

    Profissional buscarPorId(Long id);
}
