package com.udemy.num09Exercicio2.application;

import com.udemy.num09Exercicio2.entities.Produto;
import com.udemy.num09Exercicio2.entities.ProdutoImportado;
import com.udemy.num09Exercicio2.entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Produto #" + i);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (ch == 'c') {
                list.add(new Produto(nome, preco));
            } else if (ch == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new ProdutoUsado(nome, preco, dataFabricacao));

            } else{
                System.out.print("Taxa Alfândega: ");
                double taxaAlfandega = sc.nextDouble();
                list.add(new ProdutoImportado(nome, preco, taxaAlfandega));
            }
        }
        System.out.println();
        System.out.println("ETIQUETA DE PREÇO: ");
        for (Produto prod : list) {
            System.out.println(prod.etiquetaPreco());


        }

        sc.close();
    }

}
