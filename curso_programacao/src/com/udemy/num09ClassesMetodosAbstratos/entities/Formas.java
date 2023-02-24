package com.udemy.num09ClassesMetodosAbstratos.entities;

import com.udemy.num09ClassesMetodosAbstratos.entities.enums.Cor;

public abstract class Formas {

    private Cor cor;

    public Formas() {

    }

    public Formas(Cor cor) {
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();
}
