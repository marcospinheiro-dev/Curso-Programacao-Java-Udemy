package com.udemy.quatroAulaVetor2.application;

import com.udemy.quatroAulaVetor2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for (int i = 0; i < n; i++) { //Pode ser usado tbm vetor.length no lugar de n
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getPrice();
        }
        double media;
        media = soma / n;

        System.out.printf("A média dos preços é: %.2f%n", media);




        sc.close();
    }
}
