package com.udemy.umExercicios;

import java.util.Scanner;

public class ExercSoma {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numA = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numB = sc.nextInt();
        int soma = numA + numB;

        System.out.println("A soma dos números é: " + soma);

        sc.close();

    }
}
