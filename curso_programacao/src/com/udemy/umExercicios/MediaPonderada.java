package com.udemy.umExercicios;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();
            double mediaPonderada = (nota1*2 + nota2*3 + nota3*5) / (2+3+5);

            System.out.printf("%.1f%n", mediaPonderada);
        }
        sc.close();
    }
}
