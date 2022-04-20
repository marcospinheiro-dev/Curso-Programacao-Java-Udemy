package com.udemy.doisAulasMembrosEstaticos.exercFix.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class MainDollar {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Qual o preço do dólar? ");
        CurrencyConverter.priceDollar = sc.nextDouble();

        System.out.print("Digite a quantidade de dólar que deseja comprar: ");
        CurrencyConverter.quantDollar = sc.nextDouble();

        System.out.printf("O valor líquido é: %.2f%n", CurrencyConverter.valorConverter());
    }
}
