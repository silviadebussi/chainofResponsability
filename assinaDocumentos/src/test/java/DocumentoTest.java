package com.exemple.assinadocumento;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentoTest {

    @Test
    public void analistaPodeAssinarRelatorio() {
        Funcionario analista = new Analista("Ana");
        Documento doc = new Documento("Relatório Mensal", "relatorio");
        AssinaturaCheck check = new AssinaturaCheck(analista);
        assertTrue(check.podeAssinar(doc));
    }

    @Test
    public void analistaNaoPodeAssinarContrato() {
        Funcionario analista = new Analista("Ana");
        Documento doc = new Documento("Contrato de Fornecimento", "contrato");
        AssinaturaCheck check = new AssinaturaCheck(analista);
        assertFalse(check.podeAssinar(doc));
    }

    @Test
    public void gerentePodeAssinarContrato() {
        Funcionario gerente = new Gerente("Carlos");
        Documento doc = new Documento("Contrato de Serviço", "contrato");
        AssinaturaCheck check = new AssinaturaCheck(gerente);
        assertTrue(check.podeAssinar(doc));
    }

    @Test
    public void diretorPodeAssinarOrcamento() {
        Funcionario diretor = new Diretor("João");
        Documento doc = new Documento("Orçamento Anual", "orcamento");
        AssinaturaCheck check = new AssinaturaCheck(diretor);
        assertTrue(check.podeAssinar(doc));
    }

    @Test
    public void gerenteNaoPodeAssinarOrcamento() {
        Funcionario gerente = new Gerente("Carlos");
        Documento doc = new Documento("Orçamento de Projetos", "orcamento");
        AssinaturaCheck check = new AssinaturaCheck(gerente);
        assertFalse(check.podeAssinar(doc));
    }

    @Test
    public void tipoDesconhecidoNaoPermiteAssinatura() {
        Funcionario diretor = new Diretor("João");
        Documento doc = new Documento("Documento Confidencial", "confidencial");
        AssinaturaCheck check = new AssinaturaCheck(diretor);
        assertFalse(check.podeAssinar(doc));
    }
}
