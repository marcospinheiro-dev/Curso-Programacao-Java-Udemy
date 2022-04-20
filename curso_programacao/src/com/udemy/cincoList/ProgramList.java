package com.udemy.cincoList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {

    public static void main(String[] args) {

        //List é interface e o ArrayList(existem outros) implementa a List
        //Em List<não se pode colocar tipo primitivo, so wrapper>
        List<String> list = new ArrayList<>();
        list.add("Marcos");
        list.add("Anna");
        list.add("Lucas");
        list.add("Adelly");
        list.add(2, "Laura"); //Inclui por posição e argumento
        list.add("Liz");

        System.out.println(list.size()); //Mostra o tamanho da list
        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("----------------------------------------");
        list.remove("Anna"); //Por comparação de nome
        list.remove(1); //Por posição
        list.removeIf(obj->obj.charAt(0) == 'M');

        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("----------------------------------------");
        System.out.println("Index off Adelly: " + list.indexOf("Adelly")); //Mostra o índice
        System.out.println("Index off Anna: " + list.indexOf("Anna"));
        System.out.println("----------------------------------------");
        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("----------------------------------------");
        //Filtar todos por argumento. Converter a List para stream e depois para List usando collect
        List<String> result = list.stream().filter(obj->obj.charAt(0) == 'L').collect(Collectors.toList()); //ou só toList
        System.out.println(result);
        for (String obj : result) {
            System.out.println(obj);
        }
        System.out.println("----------------------------------------");
        //Buscar o 1º elemento por argumento
        String name = list.stream().filter(obj->obj.charAt(0) == 'L').findFirst().orElse(null);
        String nome = list.stream().filter(obj->obj.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(nome);
    }
}
