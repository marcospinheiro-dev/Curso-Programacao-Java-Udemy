package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercQuadrantesCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Primeiro");
        }else if (x < 0 && y > 0 ) {
            System.out.println("Segundo");
        }else if (x < 0 && y < 0) {
            System.out.println("Terceiro");
        }else if (x > 0 && y < 0) {
            System.out.println("Quarto");
        }else{
            System.out.println("Quadrante inválido");
        }
    }
}
