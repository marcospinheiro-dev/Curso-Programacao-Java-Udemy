package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercHraTrab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do funcionário: ");
        int numFunc = sc.nextInt();

        System.out.println("Qunatidade de horas trabalhadas: ");
        int horaTrab = sc.nextInt();

        System.out.println("Qual o valor da hora trabalhada? ");
        double valorHoraTrab = sc.nextDouble();

        double salario = horaTrab*valorHoraTrab;

        System.out.println("Funcionário nº: " + numFunc);
        System.out.printf("Salário: U$ %.2f%n", salario);

        sc.close();

    }
}
