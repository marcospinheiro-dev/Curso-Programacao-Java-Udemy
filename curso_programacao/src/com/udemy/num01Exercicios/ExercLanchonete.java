package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercLanchonete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o produto e a quantidade: ");
        int prod = sc.nextInt();
        int quantidade = sc.nextInt();

        double prod1 = 4.00;
        double prod2 = 4.50;
        double prod3 = 5.00;
        double prod4 = 2.00;
        double prod5 = 1.00;

        String produto;

        switch (prod){
            case 1:
                System.out.printf("Cachorro quente, Total: R$ %.2f%n", quantidade * prod1);
                break;
            case 2:
                System.out.printf("X-salada, Total: R$ %.2f%n", quantidade * prod2);
                break;
            case 3:
                System.out.printf("X-bacon, Total: R$ %.2f%n", quantidade * prod3);
                break;
            case 4:
                System.out.printf("Torrada simples, Total: R$ %.2f%n", quantidade * prod4);
                break;
            case 5:
                System.out.printf("Refrigerante, Total: R$ %.2f%n", quantidade * prod5);
                break;
            default:
                System.out.println("Produto inválido");
                break;
        }

        sc.close();
    }
}
