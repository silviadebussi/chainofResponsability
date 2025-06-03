package com.exemple.assinadocumento;

public class AssinaturaCheck {
    private Funcionario funcionario;

    public AssinaturaCheck(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean podeAssinar(Documento doc) {
        return doc.podeSerAssinadoPor(funcionario.getCargo());
    }
}
