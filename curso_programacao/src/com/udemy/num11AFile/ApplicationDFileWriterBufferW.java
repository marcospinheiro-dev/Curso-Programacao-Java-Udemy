package com.udemy.num11AFile;

import java.io.*;

public class ApplicationDFileWriterBufferW {

    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia!","Boa tarde!", "Boa noite!"};

        String path = "d:\\tempUdemy\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            // new FileWriter(path) = recria --------- new FileWriter(path, true) = cria novo e acrescenta
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
