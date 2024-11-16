package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/*
        Importar Assertions de modo static para não precisa ficar reescrevendo "Assertions" toda hora quando for utilizar o metodo
*/

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void validarLancamento() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Neto", LocalDateTime.now());

        assertNotNull(pessoa);

    }

    @Test
    void validarNumerosDeTiposDiferentes() {

        double valor = 5.0;
        double outrovalor = 5.0;

        assertEquals(valor, outrovalor);
    }
}
