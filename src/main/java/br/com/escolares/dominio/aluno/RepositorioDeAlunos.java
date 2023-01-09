package br.com.escolares.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf) throws AlunoNaoEncontrado;

    List<Aluno> listarTodosAlunosMatriculados();
}
