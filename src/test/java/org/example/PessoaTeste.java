package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTeste {

/*
    @Test
    public void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Ana Júlia", LocalDate.of(2022, 1, 1));
        Assertions.assertEquals(2, pessoa.getIdade());
    }
*/

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15, 1, 1));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa Joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(Joao.ehMaiorDeIdade());

    }
}
