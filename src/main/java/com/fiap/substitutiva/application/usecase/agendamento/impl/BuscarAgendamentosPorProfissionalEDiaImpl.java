package com.fiap.substitutiva.application.usecase.agendamento.impl;

import com.fiap.substitutiva.application.usecase.agendamento.BuscarAgendamentosPorProfissionalEDia;
import com.fiap.substitutiva.domain.entities.Agendamento;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class BuscarAgendamentosPorProfissionalEDiaImpl {

    private final BuscarAgendamentosPorProfissionalEDia buscarAgendamentosPorProfissionalEDia;

    public BuscarAgendamentosPorProfissionalEDiaImpl(BuscarAgendamentosPorProfissionalEDia buscarAgendamentosPorProfissionalEDia) {
        this.buscarAgendamentosPorProfissionalEDia = buscarAgendamentosPorProfissionalEDia;
    }

    public List<Agendamento> buscarAgendamentos(Long idProfissional, LocalDate data) {
        List<Agendamento> agendamentos = buscarAgendamentosPorProfissionalEDia.buscarAgendamentos(idProfissional, data);
        if (Objects.isNull(agendamentos)) throw new NoSuchElementException("Não foram encontrados agendamentos");
        return agendamentos;
    }
}
