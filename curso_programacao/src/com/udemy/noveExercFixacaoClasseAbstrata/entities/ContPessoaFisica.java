package com.udemy.noveExercFixacaoClasseAbstrata.entities;

public class ContPessoaFisica extends Contribuintes {

    private Double gastoComSaude;

    public ContPessoaFisica() {
        super();
    }

    public ContPessoaFisica(String nome, Double rendimentoAnual, Double gastoComSaude) {
        super(nome, rendimentoAnual);
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public double imposto() {
        //double imposto = (getRendimentoAnual() < 20000.0) ? getRendimentoAnual() * 0.15 : getRendimentoAnual() * 0.25;

        if (getRendimentoAnual() < 20000.0) {
            return (getRendimentoAnual() * 0.15) - (gastoComSaude * 0.50);
        }
        if (getRendimentoAnual() >= 20000.0) {
            return (getRendimentoAnual() * 0.25) - (gastoComSaude * 0.50);
        }
        return 0;
    }
}
