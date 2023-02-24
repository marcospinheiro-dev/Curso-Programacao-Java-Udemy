package com.udemy.num09Heranca.aplication;

import com.udemy.num09Heranca.entities.Conta;
import com.udemy.num09Heranca.entities.ContaEmpresarial;
import com.udemy.num09Heranca.entities.ContaPoupanca;

public class ProgramHeranca {

    public static void main(String[] args) {

        Conta acc = new Conta(123, "Marcos", 0.0);
        ContaEmpresarial bacc = new ContaEmpresarial(246, "Laura", 0.0, 500.0);

        //UPCASTING
        Conta acc1 = bacc;
        Conta acc2 = new ContaEmpresarial(246, "Lucas", 0.0, 500.0);
        Conta acc3 = new ContaPoupanca(136, "Anna", 0.0, 0.01);

        //DOWNCASTING
        ContaEmpresarial acc4 = (ContaEmpresarial) acc2;
        acc4.emprestimo(100.0);

        //ContaEmpresarial acc5 = (ContaEmpresarial) acc3; // acc3 é ContaPoupanca, vai dar erro em tempo de execução
        if (acc3 instanceof ContaEmpresarial) {
            ContaEmpresarial acc5 = (ContaEmpresarial)acc3;
            acc5.emprestimo(200.0);
            System.out.println("Empréstimo!");
        }
        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca)acc3;
            acc5.atualizarSaldo();
            System.out.println("Saldo atualizado!");
        }

        //Sobreposição
        Conta acc6 = new Conta(0013, "Lucas", 1000.0);
        acc6.saque(200.0);
        System.out.println(acc6.getSaldo());
        Conta acc7 = new ContaPoupanca(3003, "Adelly", 1000.0, 0.01);
        acc7.saque(200.0);
        System.out.println(acc7.getSaldo());

        Conta acc8 = new ContaEmpresarial(2020, "Aninha", 1000.0, 500.00);
        acc8.saque(200.00);
        System.out.println(acc8.getSaldo());

    }



}
