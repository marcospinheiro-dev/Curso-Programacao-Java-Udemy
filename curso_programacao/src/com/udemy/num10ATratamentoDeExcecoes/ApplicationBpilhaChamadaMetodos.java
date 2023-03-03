package com.udemy.num10ATratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationBpilhaChamadaMetodos {

    public static void main(String[] args) {

        metodo1();

        System.out.println("Programa encerrado");

    }
    public static void metodo1() {
        System.out.println("***metodo1() início***");
        metodo2();
        System.out.println("***metodo1() fim***");
    }
    public static void metodo2() {
        System.out.println("***metodo2() início***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace(); //Rastreamento do stack
            sc.next(); //Para encerrar o programa
        }
        catch (InputMismatchException e) {
            System.out.println("Caracter indevido!");
            e.printStackTrace();
            sc.next();
        }
        System.out.println("***metodo2() fim***");

        sc.close();
    }
}
