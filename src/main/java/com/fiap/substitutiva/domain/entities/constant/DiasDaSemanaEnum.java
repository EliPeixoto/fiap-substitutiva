package com.fiap.substitutiva.domain.entities.constant;

public enum DiasDaSemanaEnum {
    MONDAY("Segunda"),
    TUESDAY("Terça"),
    WEDNESDAY("Quarta"),
    THURSDAY("Quinta"),
    FRIDAY("Sexta"),
    SATURDAY("Sábado"),
    SUNDAY("Domingo");

    private String diaDaSemana;

    DiasDaSemanaEnum(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }
}

