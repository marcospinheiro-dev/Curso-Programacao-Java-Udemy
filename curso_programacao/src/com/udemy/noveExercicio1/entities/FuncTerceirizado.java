package com.udemy.noveExercicio1.entities;

public class FuncTerceirizado extends Funcionario {

    private Double bonusAdicional;

    public FuncTerceirizado() {
        super();
    }

    public FuncTerceirizado(String nome, Integer hora, Double valorHora, Double bonusAdicional) {
        super(nome, hora, valorHora);
        this.bonusAdicional = bonusAdicional;
    }

    public Double getBonusAdicional() {
        return bonusAdicional;
    }

    public void setBonusAdicional(Double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + bonusAdicional * 1.1;
    }
}
