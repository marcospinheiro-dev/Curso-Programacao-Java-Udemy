/*
Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.

 */

package com.udemy.seisMatriz.apllication;

import java.util.Scanner;

public class ProgramMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < mat.length; i++) {  // Ou for (int i = 0; i < n; i++)
            for (int j = 0; j < mat[i].length; j++) {  // Ou for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) { // Ou for (int i = 0; i < n; i++)
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < mat.length; i++) { // Ou for (int i = 0; i < n; i++)
            for (int j = 0; j < mat[i].length; j++) {  // Ou for (int j = 0; j < n; j++)
                if(mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.print("Negative number= " + count);

        sc.close();
    }
}
