package com.udemy.num10CExercFixacao.model.exception;

public class ContaException extends RuntimeException {

    //    private static final long serialVersionUID = 1L;

    public ContaException(String msg) { // Permite instanciar a classe passando uma mensagem.
        super(msg);
    }
}
