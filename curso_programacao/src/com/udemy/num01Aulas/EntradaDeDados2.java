package com.udemy.num01Aulas;

import java.util.Scanner;

public class EntradaDeDados2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        // Qdo ocorre um nextInt, nextDouble ou outro qualquer antes de um nextLine, fica uma quebra de linha,
        // para resolver isso coloque um nextLine antes do nextLine em questão.
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
