package br.com.escolares.dominio.aluno;

public class Telefone {
    private String ddd;
    private static String numero;

    public Telefone(String ddd, String numero) {

        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e numero são sao obrigatorios!");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD invalido!");
        }

        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero invalido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public static String getNumero() {
        return getNumero();
    }

    public static String getDdd() {
        return getDdd();
    }
}
