/*
Programa para ler um valor qualquer, e daí mostrar qto seria o valor de uma circunferência e do volume de uma esfera
para um raio daquele valor. Informar tbm o valor PI com duas casas decimais.
 */

//Classe estática não pode ser instanciada.


package com.udemy.doisAulasMembrosEstaticos.alternativa1.membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {
    public static final double PI = 3.14159; //PI membro estático, para determinar que PI é constante e não variável
    //acrescenta-se a palavra "final" e por padrão é maiúsculo. Qdo for palavra composta usar "_" , ex.: NET_SALARIO.
    //Dentro de uma classe estática não pode ser chamado outras classes que não sejam estáticas.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);
        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }
    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }

}


