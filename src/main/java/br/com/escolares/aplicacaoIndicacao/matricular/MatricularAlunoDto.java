package br.com.escolares.aplicacaoIndicacao.matricular;


import br.com.escolares.dominio.aluno.Aluno;
import br.com.escolares.dominio.aluno.CPF;
import br.com.escolares.dominio.aluno.Email;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(
				new CPF(cpfAluno),
				nomeAluno, 
				new Email(emailAluno));
	}
	
}
