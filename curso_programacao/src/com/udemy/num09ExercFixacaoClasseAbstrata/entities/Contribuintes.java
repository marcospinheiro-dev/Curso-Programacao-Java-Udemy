package com.udemy.num09ExercFixacaoClasseAbstrata.entities;

public abstract class Contribuintes {

    private String nome;
    private Double rendimentoAnual;

    public Contribuintes() {
    }

    public Contribuintes(String nome, Double rendimentoAnual) {
        this.nome = nome;
        this.rendimentoAnual = rendimentoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual() {
        this.rendimentoAnual = rendimentoAnual;
    }

    public abstract double imposto();
//    public abstract double somaImpostos();
}
