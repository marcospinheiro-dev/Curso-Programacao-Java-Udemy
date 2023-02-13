package com.udemy.noveExercFixacaoClasseAbstrata.application;

import com.udemy.noveExercFixacaoClasseAbstrata.entities.ContPessoaFisica;
import com.udemy.noveExercFixacaoClasseAbstrata.entities.ContPessoaJuridica;
import com.udemy.noveExercFixacaoClasseAbstrata.entities.Contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgExercFixacaoAbst {

    public static <Contribuinte> void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuintes> list = new ArrayList<>();


        System.out.print("Entre com o número de contribuintes: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i + ":");
            System.out.print("É pessoa física ou jurídica (f/j): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome do contribuinte: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'f') {
                System.out.print("Gasto com saúde: ");
                double gastoComSaude = sc.nextDouble();
                list.add((Contribuintes) new ContPessoaFisica(nome, rendaAnual, gastoComSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add((Contribuintes) new ContPessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }

        }
        System.out.println();
        System.out.println("Impostos pagos:");
        for (Contribuintes contribuinte : list) {
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.imposto()));
//            System.out.println(String.format("%.2f", contribuinte.imposto()));
        }
        System.out.println();
        double somaImposto = 0.00;
        for (Contribuintes contribuinte : list) {
            somaImposto += contribuinte.imposto();
        }
        System.out.println("Total de impostos: $ " + String.format("%.2f", somaImposto));

        sc.close();
    }
}
