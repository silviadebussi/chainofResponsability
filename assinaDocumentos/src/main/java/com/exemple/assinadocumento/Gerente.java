package com.exemple.assinadocumento;

// Subclasse com.exemple.assinadocumento.Gerente
public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public String getCargo() {
        return "com.exemple.assinadocumento.Gerente";
    }
}
