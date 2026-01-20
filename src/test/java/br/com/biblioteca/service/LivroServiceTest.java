package br.com.biblioteca.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LivroServiceTest {

    @Test
    public void deveRetornarTrueParaStatusValido() {
        LivroService service = new LivroService();

        boolean resultado = service.statusValido("LIDO");

        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalseParaStatusInvalido() {
        LivroService service = new LivroService();

        boolean resultado = service.statusValido("EMPRESTADO");

        assertFalse(resultado);
    }
}
