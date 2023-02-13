package com.udemy.noveClassesMetodosAbstratos.entities;

import com.udemy.noveClassesMetodosAbstratos.entities.enums.Cor;

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
