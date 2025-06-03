package com.exemple.assinadocumento;

public class Documento {
    private String titulo;
    private String tipo;

    public Documento(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo.toLowerCase(); // padroniza
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean podeSerAssinadoPor(String cargo) {
        if (tipo.equals("relatorio")) {
            return cargo.equals("com.exemple.assinadocumento.Analista") || cargo.equals("com.exemple.assinadocumento.Gerente") || cargo.equals("com.exemple.assinadocumento.Diretor");
        } else if (tipo.equals("contrato")) {
            return cargo.equals("com.exemple.assinadocumento.Gerente") || cargo.equals("com.exemple.assinadocumento.Diretor");
        } else if (tipo.equals("orcamento")) {
            return cargo.equals("com.exemple.assinadocumento.Diretor");
        } else {
            return false; // tipo desconhecido
        }
    }
}
