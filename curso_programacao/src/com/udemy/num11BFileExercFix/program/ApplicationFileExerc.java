package com.udemy.num11BFileExercFix.program;

import com.udemy.num11BFileExercFix.entities.Produto;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationFileExerc {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();

        System.out.println("Entre com o caminho do aqrquivo: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();


        boolean succes = new File(sourceFolderStr + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itenCsv = br.readLine();
            while (itenCsv != null) {

                String[] fields = itenCsv.split(",");
                String nome = fields[0];
                double preco = Double.parseDouble(fields[1]);
                int quantidade = Integer.parseInt(fields[2]);

                list.add(new Produto(nome, preco, quantidade));
                System.out.println(itenCsv);
                itenCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Produto item : list) {
                    bw.write(item.getNome() + "," + String.format("%.2f", item.valorTotal()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + "  CREATED");

            }
            catch (IOException e) {
                System.out.println("Error Writing file: " + e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.println("Error Writing file: " + e.getMessage());
        }


        sc.close();
    }
}
// Para executar este programa, antes tem q excluir as pastas que serão criadas, pois já existem por ter sido executado