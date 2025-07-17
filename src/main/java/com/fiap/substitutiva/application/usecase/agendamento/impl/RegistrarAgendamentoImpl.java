package com.fiap.substitutiva.application.usecase.agendamento.impl;

import com.fiap.substitutiva.application.usecase.agendamento.RegistrarAgendamento;
import com.fiap.substitutiva.domain.entities.Agendamento;

public class RegistrarAgendamentoImpl {
    private final RegistrarAgendamento registrarAgendamento;

    public RegistrarAgendamentoImpl(RegistrarAgendamento registrarAgendamento){
        this.registrarAgendamento = registrarAgendamento;
    }

    public Agendamento registrarAgendamento(Agendamento agendamento){
        agendamento.setId(null);
        return registrarAgendamento.registrarAgendamento(agendamento);
    }
}
