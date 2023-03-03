package com.udemy.num10CExercFixacao.application;

import com.udemy.num10CExercFixacao.model.entities.Conta;
import com.udemy.num10CExercFixacao.model.exception.ContaException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationExercFix {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
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

            conta.saque(montante);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}
