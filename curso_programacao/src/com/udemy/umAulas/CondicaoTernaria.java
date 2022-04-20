package com.udemy.umAulas;

import java.util.Scanner;

public class CondicaoTernaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        double desconto = (preco <20 ? preco * 0.1 : preco * 0.05);

        System.out.println("Valor do desconto: R$ " + desconto);

        sc.close();
    }
}
