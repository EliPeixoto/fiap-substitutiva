package com.fiap.substitutiva.application.usecase.foto;

import com.fiap.substitutiva.domain.entities.Foto;

import java.util.List;

public interface BuscarFotosPorIdEstabelecimento {
    List<Foto> buscarFotoPorIdEstabelecimento(Long idEstabelecimento);
}
