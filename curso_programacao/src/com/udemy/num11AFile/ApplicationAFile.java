package com.udemy.num11AFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ApplicationAFile {

    public static void main(String[] args) {

        File file = new File("d:\\tempUdemy\\in.txt"); //É padrão usar "\\" no caminho do arquivo
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
