package com.udemy.noveExercFixacaoClasseAbstrata.entities;

public class ContPessoaJuridica extends Contribuintes {

    private int numeroDeFuncionarios;

    public ContPessoaJuridica() {
        super();
    }

    public ContPessoaJuridica(String nome, Double rendimentoAnual, int numeroDeFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double imposto() {
        if (getRendimentoAnual() <= 10) {
            return getRendimentoAnual() * 0.16;
        }
        if (getRendimentoAnual() > 10) {
            return getRendimentoAnual() * 0.14;
        }
        return 0;
    }
}
