package com.udemy.noveHeranca.entities;

public class ContaEmpresarial extends Conta {

    private Double limiteEmprestimo;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double montante) {
        if (montante <= limiteEmprestimo) {
//            deposito(montante);
            saldo += montante - 10.0;
        }

    }

    @Override
    public void saque(double montante) {
        super.saque(200);
        saldo -= 2.0;
    }

//    @Override
//    public String toString() {
//        return "ContaEmpresarial{" +
//                "limiteEmprestimo=" + limiteEmprestimo +
//                '}';
//    }
}
