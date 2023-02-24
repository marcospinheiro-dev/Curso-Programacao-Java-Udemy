package com.udemy.num09Exercicio2.entities;

public class ProdutoImportado extends Produto{

    private Double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double preçoTotal() {
        return getPreco() + taxaAlfandega;
    }

    @Override
    public String etiquetaPreco() {
        return getNome()
                + " (usado) $ "
                + String.format("%.2f", getPreco())
                + " (Taxa Alfândega: "
                + taxaAlfandega
                + ")";
    }
}
