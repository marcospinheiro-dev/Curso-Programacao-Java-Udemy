package com.udemy.num03BancoConstrutor.entities;

public class Conta {

    private String nome;
    private int numeroConta;
    private double saldo;


    public Conta() {
    }

    public Conta(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;

    }

    public Conta(String nome, int numeroConta, double depositoInicial) {
        super();
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    public void deposito(double montante){
        saldo += montante;
    }

    public void sacar(double montante) {
        saldo -= montante + 5.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo= " + saldo +
                '}';
    }

}

