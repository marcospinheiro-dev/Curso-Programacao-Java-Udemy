package com.udemy.num03BancoConstrutor.application;

import com.udemy.num03BancoConstrutor.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class MainConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();
        //conta.getNumeroConta() = sc.nextInt();
        System.out.print("Nome do titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Tem depósito inicial  (s/n)? ");
        char response = sc.next().charAt(0);
        if(response == 's') {
            System.out.print("Entre com o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(nome, numeroConta, depositoInicial);
        } else {
            conta = new Conta(nome, numeroConta);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre como o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre como o valor do saque: ");
        double valorDoSaque = sc.nextDouble();
        conta.sacar(valorDoSaque);
        System.out.println("Atualização dos dados da conta: ");
        System.out.println(conta);



        sc.close();
    }
}
