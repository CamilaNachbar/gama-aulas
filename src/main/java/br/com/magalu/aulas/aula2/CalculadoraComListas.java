package br.com.magalu.aulas.aula2;

import java.util.List;

public class CalculadoraComListas {

    public CalculadoraComListas(Integer valorA, Integer valorB) {

    }

    public CalculadoraComListas() {

    }

    public CalculadoraComListas(Integer valorA) {

    }

    public CalculadoraComListas(Double valorb) {

    }


    public Integer somar(Integer valorA, Integer valorB) {
        return valorA + valorB;
    }

    public void historico(List<Integer> list) {
        for (int i = 0; list.size() >= i; i++) {
            System.out.println(list.get(i));
        }
    }

}
