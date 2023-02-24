package com.udemy.num04ExercicioVetorPensionato.application;

import com.udemy.num04ExercicioVetorPensionato.entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaPensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pensionato[] vetor = new Pensionato[10];

        System.out.print("Quantos quartos serão ocupados? ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Rent # " + i + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Pensionato(name, email);
        }
        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if(vetor[i] != null) {
                System.out.println(i + " : " + vetor[i]);
                //System.out.println(vetor.toString());
            }

        }
        sc.close();
    }
}
