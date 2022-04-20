package com.udemy.umExercicios;

import java.util.Scanner;

public class ExercPositivoOuNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Neutro");
        }
    }
}
