package com.udemy.num09ClassesMetodosAbstratos.application;

import com.udemy.num09ClassesMetodosAbstratos.entities.Formas;
import com.udemy.num09ClassesMetodosAbstratos.entities.enums.Cor;
import com.udemy.num09ClassesMetodosAbstratos.entities.Retangulo;
import com.udemy.num09ClassesMetodosAbstratos.entities.Circulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaAbstrato {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Formas> list = new ArrayList<>();

        System.out.print("Entre com o número de formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Dados da forma #"+ i + ":");
            System.out.print("É retângulo ou circo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
            Cor cor = Cor.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                list.add(new Retangulo(cor, largura, altura));
            }
            else{
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                list.add(new Circulo(cor, raio));
            }
        }
        System.out.println();
        System.out.println("Áreas das formas");
        for (Formas forma : list) {
            System.out.println(String.format("%.2f", forma.area()));

        }

        sc.close();
    }
}
