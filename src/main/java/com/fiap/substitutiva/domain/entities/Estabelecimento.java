package com.fiap.substitutiva.domain.entities;

public class Estabelecimento {
    private Long id;
    private String nome;
    private String especialidade;
    private String profissionaisDisponiveis;
    private String fotos;

    public Long getId() {
        return id;
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

    public String getProfissionaisDisponiveis() {
        return profissionaisDisponiveis;
    }

    public void setProfissionaisDisponiveis(String profissionaisDisponiveis) {
        this.profissionaisDisponiveis = profissionaisDisponiveis;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public Estabelecimento() {
    }

    public Estabelecimento(Long id, String nome, String especialidade, String profissionaisDisponiveis, String fotos) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.profissionaisDisponiveis = profissionaisDisponiveis;
        this.fotos = fotos;
    }
}
