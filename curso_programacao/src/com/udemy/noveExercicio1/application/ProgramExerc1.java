package com.udemy.noveExercicio1.application;

import com.udemy.noveExercicio1.entities.FuncTerceirizado;
import com.udemy.noveExercicio1.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExerc1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.println("Funcionário #" + i + " : ");
            System.out.print("Terceirizado (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Hora: ");
            int hora = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Bônus adicional: ");
                double bonusAdicional = sc.nextDouble();
                list.add(new FuncTerceirizado(nome, hora, valorHora, bonusAdicional));
            }
            else{
                list.add(new Funcionario(nome, hora, valorHora));
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionario func : list) {
            System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));
        }
        
        sc.close();
    }

}
