package com.udemy.num01Aulas;

import java.util.Scanner;

public class EntradaDeDados1 {

    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);  // Caso queira mudar a "," para "."

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String x;
        x = sc.next();
        System.out.println("Digite um número inteiro: ");
        int y;
        y = sc.nextInt();
        System.out.println("Digite um num com ponto flutuante: ");
        double z;
        z = sc.nextDouble();
        System.out.println("Digite um caracter: ");
        char w;
        w = sc.next().charAt(0);

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou: " + y);
        System.out.printf("Você digitou: %.2f%n", z);
        System.out.println("Você digitou: " + w);



        sc.close();
    }
}
