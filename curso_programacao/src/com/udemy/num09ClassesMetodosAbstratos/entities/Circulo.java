package com.udemy.num09ClassesMetodosAbstratos.entities;

import com.udemy.num09ClassesMetodosAbstratos.entities.enums.Cor;

public class Circulo extends Formas {

    private Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
