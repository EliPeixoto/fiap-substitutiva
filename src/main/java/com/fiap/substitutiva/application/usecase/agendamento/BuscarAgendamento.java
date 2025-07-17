package com.fiap.substitutiva.application.usecase.agendamento;

import com.fiap.substitutiva.domain.entities.Agendamento;

public interface BuscarAgendamento {
    Agendamento buscarAgendamento(Long id);
}
