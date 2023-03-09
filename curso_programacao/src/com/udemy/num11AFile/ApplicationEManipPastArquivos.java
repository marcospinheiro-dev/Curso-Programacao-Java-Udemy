package com.udemy.num11AFile;

import java.io.File;
import java.util.Scanner;

public class ApplicationEManipPastArquivos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a pasta do arquivo: "); //"d:\\tempUdemy"
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] pastas = path.listFiles(File::isDirectory); // isDiretory, só vem as pastas
        System.out.println("Pastas: ");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }

        File[] arquivos = path.listFiles(File::isFile); // isDiretory, só vem os arquivos
        System.out.println("Arquivos: ");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        boolean sucess = new File(strPath + "\\subdirC").mkdir(); // Cria uma sub pasta
        System.out.println("Subpasta criada com sucessso: " + sucess);


        sc.close();
    }
}