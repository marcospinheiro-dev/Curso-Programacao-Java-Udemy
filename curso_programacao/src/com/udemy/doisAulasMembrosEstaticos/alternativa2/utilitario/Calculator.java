package com.udemy.doisAulasMembrosEstaticos.alternativa2.utilitario;

public class Calculator {

    public static final double PI = 3.14159; //PI membro estático, para determinar que PI é constante e não variável
    //acrescenta-se a palavra "final" e por padrão é maiúsculo. Qdo for palavra composta usar "_" , ex.: NET_SALARIO.
    //Dentro de uma classe estática não pode ser chamado outras classes que não sejam estáticas.

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * PI * raio * raio * raio / 3;
    }
}
