package br.com.escolares.escolatest.dominio.aluno;

import br.com.escolares.dominio.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class CPFTest {
    @Test
    void naoDeveriacriarCPFComNumerosInvalidos() {

        assertThrows(IllegalArgumentException.class,() -> new CPF(rs.getString("cpf")));

        assertThrows(IllegalArgumentException.class,() -> new CPF(rs.getString("cpf")));

        assertThrows(IllegalArgumentException.class,() -> new CPF(rs.getString("cpf")));
    }
    void deveriaPermitirCriarCPFComNumerovalido() {
        String numero = "123.456.789-00";
        CPF cpf = new CPF(rs.getString("cpf"));
        assertEquals(numero, CPF.getNumero());
    }
}
