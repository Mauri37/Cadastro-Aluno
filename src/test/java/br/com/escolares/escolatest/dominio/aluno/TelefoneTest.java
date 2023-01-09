package br.com.escolares.escolatest.dominio.aluno;

import br.com.escolares.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {

        assertThrows(IllegalArgumentException.class,()-> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,() -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,() -> new Telefone("1", "123456789"));
    }
    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,() -> new Telefone("11", null));

        assertThrows(IllegalArgumentException.class,() -> new Telefone("11", ""));

        assertThrows(IllegalArgumentException.class,() -> new Telefone("11", "123"));
    }
    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}
