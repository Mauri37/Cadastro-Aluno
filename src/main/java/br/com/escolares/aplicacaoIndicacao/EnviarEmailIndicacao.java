package br.com.escolares.aplicacaoIndicacao;

import br.com.escolares.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
