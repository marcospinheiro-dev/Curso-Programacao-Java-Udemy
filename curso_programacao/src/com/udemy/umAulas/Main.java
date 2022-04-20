package com.udemy.umAulas;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        int y = 32;
        double x = 10.73584;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Olá Mundo!!!");
        System.out.println("Bom dia!");

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    }
}
