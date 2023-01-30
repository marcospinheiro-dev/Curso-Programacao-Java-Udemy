package com.udemy.noveHeranca.entities;

public class Conta {

    private Integer numero;
    private String titular;
    protected Double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

//    public void setSaldo(Double saldo) {           // Esse set sai pq n se pode alterar o saldo manualmente
//        this.saldo = saldo;
//    }

    public void saque(double montante) {
        saldo -= montante;
    }

    public void deposito(double montante) {
        saldo += montante;
    }

}
