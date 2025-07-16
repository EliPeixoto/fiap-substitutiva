package com.fiap.substitutiva.domain.entities;

public class Avaliacao {
    private Long id;
    private Agendamento agendamento;
    private Double nota;
    private String comentario;

    public Avaliacao() {
    }

    public Avaliacao(Long id, Agendamento agendamento, Double nota, String comentario) {
        this.id = id;
        this.agendamento = agendamento;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
