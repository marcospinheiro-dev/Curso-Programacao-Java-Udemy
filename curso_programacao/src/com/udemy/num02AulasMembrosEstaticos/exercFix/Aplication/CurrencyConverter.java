/*
Programa para ler cotação do dólar, fazer uma compra de dólares e mostrar o valor líquido após incluir na compra
6% de IOF.
 */
package com.udemy.num02AulasMembrosEstaticos.exercFix.Aplication;

public class CurrencyConverter {
    public static double priceDollar;
    public static double iof = 6.0 / 100 ;
    public static double quantDollar;


    public static double valorConverter() {
        return (priceDollar + (priceDollar * iof)) * quantDollar;
    }

}
