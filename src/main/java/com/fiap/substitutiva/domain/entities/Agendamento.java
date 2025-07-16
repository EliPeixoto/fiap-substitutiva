package com.fiap.substitutiva.domain.entities;

import java.time.LocalDateTime;

public class Agendamento {
    private Long id;
    private LocalDateTime dataHora;
    private Estabelecimento estabelecimento;
    private Profissional profissional;
    private Cliente cliente;
    private Servico servico;
    private StatusAgendamento status;

    public Agendamento() {
    }

    public Agendamento(Long id, LocalDateTime dataHora, Estabelecimento estabelecimento, Profissional profissional, Cliente cliente, Servico servico, StatusAgendamento status) {
        this.id = id;
        this.dataHora = dataHora;
        this.estabelecimento = estabelecimento;
        this.profissional = profissional;
        this.cliente = cliente;
        this.servico = servico;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }
}
