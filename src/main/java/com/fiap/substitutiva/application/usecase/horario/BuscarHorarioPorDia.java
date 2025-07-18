package com.fiap.substitutiva.application.usecase.horario;

import com.fiap.substitutiva.domain.entities.Horario;
import com.fiap.substitutiva.domain.entities.constant.DiasDaSemanaEnum;

public interface BuscarHorarioPorDia {
    Horario buscarHorarioPorDia(Long idEstabelecimento, DiasDaSemanaEnum dia);
}
