package com.fiap.substitutiva.application.usecase.estabelecimento;

import com.fiap.substitutiva.domain.entities.Estabelecimento;

public interface BuscarEstabelecimentoPorId {
    Estabelecimento buscarEstabelecimentoPorId(Long id);
}
