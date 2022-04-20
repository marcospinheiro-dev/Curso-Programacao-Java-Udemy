package com.udemy.umAulas;

public class FuncoesInteressantesString {

    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG ";
        String s01 = original.toLowerCase(); // Transforma tudo em miniúscula
        String s02 = original.toUpperCase(); // Transforma tudo em maiúscula
        String s03 = original.trim(); // Elimina os espaços vazios nas pontas da String
        String s04 = original.substring(2); // Lê os caracteres a partir da posição informada nos ()
        String s05 = original.substring(2, 9); // Lê os caracteres entre as posições informadas nos ()
        String s06 = original.replace('a', 'x'); // Substitui um caracter por outro informado no arg
        String s07 = original.replace("abc", "xy"); // idem anterior (sendo substring)
        int i = original.indexOf("bc"); // Posição do arg informado
        int j = original.lastIndexOf("bc"); // Última posição do índice
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
    }
}
