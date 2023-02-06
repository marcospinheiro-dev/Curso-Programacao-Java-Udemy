package com.udemy.noveHeranca.plimorfismo;

import com.udemy.noveHeranca.entities.Conta;
import com.udemy.noveHeranca.entities.ContaPoupanca;

public class ProgramPolimorf {

    public static void main(String[] args) {

        Conta x = new Conta(3435, "Marcos", 1000.0);
        Conta y = new ContaPoupanca(999, "Aurélio", 1000.0, 0.01);

        x.saque(50.0);
        y.saque(50.0);

        System.out.println(x.getSaldo());
        System.out.println(y.getSaldo());
    }
}
