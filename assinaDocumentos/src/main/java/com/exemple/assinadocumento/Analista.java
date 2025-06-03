package com.exemple.assinadocumento;

// Subclasse com.exemple.assinadocumento.Analista
public class Analista extends Funcionario {

    public Analista(String nome) {
        super(nome);
    }

    @Override
    public String getCargo() {
        return "com.exemple.assinadocumento.Analista";
    }
}
