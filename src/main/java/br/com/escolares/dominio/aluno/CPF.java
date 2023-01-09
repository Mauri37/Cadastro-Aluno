package br.com.escolares.dominio.aluno;

public class CPF {
    private static String numero;
    public CPF(String cpf) {
        if (numero == null || !numero.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("CPF invalid");
        }
        CPF.numero = numero;
    }

    public static String getNumero() {
        return numero;
    }
}

