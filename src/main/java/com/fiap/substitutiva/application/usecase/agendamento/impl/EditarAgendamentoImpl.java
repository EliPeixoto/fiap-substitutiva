package com.fiap.substitutiva.application.usecase.agendamento.impl;

import com.fiap.substitutiva.application.usecase.agendamento.BuscarAgendamento;
import com.fiap.substitutiva.application.usecase.agendamento.EditarAgendamento;
import com.fiap.substitutiva.application.usecase.estabelecimento.impl.EditarEstabelecimentoImpl;
import com.fiap.substitutiva.domain.entities.Agendamento;

import java.util.NoSuchElementException;
import java.util.Objects;

public class EditarAgendamentoImpl {

    private final EditarAgendamento editarAgendamento;
    private final BuscarAgendamento buscarAgendamento;

    public EditarAgendamentoImpl(EditarAgendamento editarAgendamento, BuscarAgendamento buscarAgendamento){
        this.editarAgendamento = editarAgendamento;
        this.buscarAgendamento = buscarAgendamento;
    }

    public Agendamento editarAgendamento(Agendamento agendamento){
        if(Objects.isNull(agendamento.getId())){
            throw new IllegalStateException("ID não pode ser nulo");
        }
        if(Objects.isNull(buscarAgendamento.buscarAgendamento(agendamento.getId()))){
            throw new NoSuchElementException("Não foi possivel encontrar o agendamento");
        }
        return editarAgendamento.editarAgendamento(agendamento);
    }
}
