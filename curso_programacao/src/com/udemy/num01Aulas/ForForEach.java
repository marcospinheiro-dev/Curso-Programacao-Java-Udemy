package com.udemy.num01Aulas;

public class ForForEach {

    public static void main(String[] args) {

        String[] vetor = new String[] {"Marcos", "Lucas", "Anna", "Adelly"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("---------------------------------------");

        for (String coisas : vetor){    //Para cada objeto "coisas" contida no vetor "vetor", faça......
            System.out.println(coisas);
        }
    }
}

