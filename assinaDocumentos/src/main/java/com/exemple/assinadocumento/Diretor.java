package com.exemple.assinadocumento;


public class Diretor extends Funcionario {

    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public String getCargo() {
        return "com.exemple.assinadocumento.Diretor";
    }
}
