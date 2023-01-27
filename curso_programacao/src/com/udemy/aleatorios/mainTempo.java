package com.udemy.aleatorios;

public class mainTempo {

    public static void main(String[] args) {

        System.out.println("O ano tem " + mesResult() + " meses");
        System.out.println("O ano tem " + diaResult() + " dias");
        System.out.println("O ano tem " + horaResult() + " horas");
        System.out.println("O ano tem " + minResult() + " minutos");
        System.out.println("O ano tem " + segResult() + " segundos");

    }

    private static int ano = 2;
    private int mes;
    private int dia;
    private int hora;
    private int min;
    private int seg;

    public static int mesResult() {
        return ano * 12;
    }

    public static int diaResult() {
        return ano * 365;
    }

    public static int horaResult() {
        return ano * 365 * 24;
    }

    public static int minResult() {
        return ano * 365 * 24 * 60;
    }

    public static int segResult() {
        return ano * 365 * 24 * 60 * 60;
    }

}
// R e s p o s t a
    //O ano tem 24 meses
    //O ano tem 730 dias
    //O ano tem 17520 horas
    //O ano tem 1051200 minutos
    //O ano tem 63072000 segundos
