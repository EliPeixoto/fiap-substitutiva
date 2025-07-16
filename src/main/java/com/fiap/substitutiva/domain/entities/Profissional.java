package com.fiap.substitutiva.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Profissional {
    private Long id;
    private String nome;
    private String especialidade;
    private LocalDateTime horariosDisponiveis;
    private BigDecimal tarifa;

    public Profissional() {
    }

    public Profissional(Long id, String nome, String especialidade, LocalDateTime horariosDisponiveis, BigDecimal tarifa) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.horariosDisponiveis = horariosDisponiveis;
        this.tarifa = tarifa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDateTime getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(LocalDateTime horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }

    public BigDecimal getTarifa() {
        return tarifa;
    }

    public void setTarifa(BigDecimal tarifa) {
        this.tarifa = tarifa;
    }
}
