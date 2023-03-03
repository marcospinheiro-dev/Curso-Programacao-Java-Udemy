package com.udemy.num10CExercFixacao.application;

import com.udemy.num10CExercFixacao.model.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationExercix {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta");
        System.out.print("Número: ");
        int numConta = sc.nextInt();
        System.out.print("Titular: ");
        sc.nextLine();
        String tituar = sc.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = sc.nextDouble();

        Conta conta = new Conta(numConta, tituar, saldo, limiteSaque);
        System.out.println();
        System.out.print("Entre com o valor a sacar: ");
        double montante = sc.nextDouble();

        if (montante > conta.getLimiteSaque()) {
            System.out.println("Erro de saque: O valor excedeu o limite de saque");
        }
        else if (montante > conta.getSaldo()) {
            System.out.println("Erro de saque: Saldo insuficiente");
        }
        else {
            conta.saque(montante);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        }


        sc.close();
    }
}
