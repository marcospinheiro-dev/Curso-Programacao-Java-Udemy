package com.udemy.num11AFile;

import java.io.File;
import java.util.Scanner;

public class ApplicationFcaminhoPastaArquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: "); //"d:\\tempUdemy"
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("getAbsoluteFile: " + path.getAbsoluteFile());



        sc.close();
    }
}
