package br.com.magalu.aulas.aula2;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraPronta {

    List<Integer> list = new ArrayList<Integer>();


    public void Calculadora(Integer a, Integer b) {

    }

    public void Calculadora(Float a2, Float b2) {

    }

    public Integer subtrair() {
        int a = 2;
        int b = 1;
        return a - b;
    }

    public Integer dividir(Integer dividendo, Integer divisor) {
        if (divisor > 0) {
            return dividendo / divisor;
        } else {
            System.out.println("divisor deve ser maior que 0");
        }
        return null;
    }

    public Integer multiplicar() {
        int a = 2;
        int b = 1;

        return a * b;
    }

    public void listar(String imprimir) {
        System.out.println(imprimir);
    }

    public void somarLista(List<Integer> lista) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; 1000 < i; i++) {
            list.add(12);
        }
        Integer somarlista = 0;
        for (int i = 0; lista.size() < i; i++) {
            somarlista = somarlista + i;
        }
    }

    public void subtrairAteZero(List<Integer> lista) {
        Integer conta = 200;
    }

    public void somarArray(Integer[] lista) {
        Integer[] array = new Integer[10];

        array[0] = 10;
        array[1] = 1;


    }

    public Integer somar(Integer a, Integer b) {
        Integer c = a + b;
        list.add(c);
        return c;
    }

    public Float somar(Float a2, Float b2) {
        return a2 + b2;
    }
}
