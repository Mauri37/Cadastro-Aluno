package br.com.escolares.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String CPF;
    private String nome;
    private Email email;
    private String senha;

    private final List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
    public String getCpf() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email.getEndereco();
    }

    public Telefone[] getTelefones() {
        return getTelefones();
    }

}
