package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BancoDeDadosTeste {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15, 1, 1)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        BancoDeDados.removerDados(new Pessoa("jessica", LocalDateTime.of(2000, 1, 1, 15, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
