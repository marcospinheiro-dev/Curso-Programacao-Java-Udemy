package com.udemy.quatroAulaVetor1;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationVetor1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[3];
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double media;
        media = soma/n;

        System.out.printf("Média = %.2f%n", media);


        sc.close();
    }
}
