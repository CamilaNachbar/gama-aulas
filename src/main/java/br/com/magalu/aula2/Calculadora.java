package br.com.magalu.aula2;

import java.util.ArrayList;
import java.util.Random;

public class Calculadora {

    //Declaração dos atributos
    //criando uma lista para armazenar os resultados
    ArrayList<Double> listahistorico = new ArrayList<Double>();

    // Declaração dos métodos
    public Calculadora(){
    }

    //método construtor da classe com 4 valores
    public Calculadora(Integer A, Integer B, Integer C, Integer D) {
        somar(A, C);
    }

    //método construtor da classe com 2 floats
    public Calculadora(Float a2, Float b2){
        somar (a2, b2);
    }

    //soma
    public void somar(Integer num1, Integer num2){
        int num3 = num1 + num2;
        exibirI(num1, num2);
        System.out.println("Valor da soma: " + num3);
        listahistorico.add(Double.valueOf(num3));
    }

    public void somar(Float a2, Float b2){
        Float c2 = a2 + b2;
        exibirF(a2, b2);
        System.out.println("Valor da soma: " + c2);
        listahistorico.add(Double.valueOf(c2));
    }

    //subtração
    public void subtrair(Integer num1, Integer num2){
        int num3 = num1 - num2;
        exibirI(num1, num2);
        System.out.println("Valor da subtração: " + num3);
    }

    //dividir
    public void dividir(Integer num1, Integer num2) {
        int num3 = num1 / num2;
        exibirI(num1, num2);
        System.out.println("Valor da divisão: " + num3);
    }

    //multiplicar
    public void multiplicar(Integer num1, Integer num2) {
        int num3 = num1 * num2;
        exibirI(num1, num2);
        System.out.println("Valor da multiplicação: " + num3);
    }

    //printar integer
    public void exibirI(Integer num1, Integer num2){
        System.out.println("Valor de A: " + num1);
        System.out.println("Valor de C " + num2);
    }

    //printar float
    public void exibirF(Float num1, Float num2){
        System.out.println("Valor de a2: " + num1);
        System.out.println("Valor de b2: " + num2);
    }

    //imprimindo valores
    public void listarHistorico() {
        for (Double valor: listahistorico
        ) {
            System.out.println(valor);
        }
    }
}

