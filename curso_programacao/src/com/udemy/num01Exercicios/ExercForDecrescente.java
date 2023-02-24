package com.udemy.num01Exercicios;

import java.util.Scanner;

public class ExercForDecrescente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {

            System.out.println(i);
        }
        sc.close();
    }
}
