package com.fiap.substitutiva.application.usecase.agendamento;

import com.fiap.substitutiva.domain.entities.Agendamento;

import java.util.List;

public interface BuscarAgendamentosPorCliente {

    List<Agendamento> buscarAgendamentos(Long idCliente);
}
