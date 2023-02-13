package com.udemy.noveClassesMetodosAbstratos.entities;

import com.udemy.noveClassesMetodosAbstratos.entities.enums.Cor;

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
