/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */

package com.udemy.seisMatriz.exercicioFixacao;

import java.util.Scanner;

public class ProgramExerc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matExerc = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matExerc[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um número pertencente à matriz: ");
        int x = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matExerc[i][j] == x) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matExerc[i][j-1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + matExerc[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima " + matExerc[i-1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo " + matExerc[i+1][j]);
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
