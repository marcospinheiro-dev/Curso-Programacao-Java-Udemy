package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercDiferenca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para A, B, C e D: ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int diferenca = A * B - C * D;

        System.out.println("A diferença é: " + diferenca);

        sc.close();


    }
}
