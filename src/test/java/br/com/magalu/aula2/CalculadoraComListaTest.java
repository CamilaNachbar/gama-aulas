package br.com.magalu.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraComListaTest {

    @Test
    void valores() {
        //instanciando
        Calculadora comLista = new Calculadora();
        comLista.listarHistorico();

    }
}