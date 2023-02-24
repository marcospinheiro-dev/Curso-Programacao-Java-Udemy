package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercAreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi*raio*raio;

        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }
}
