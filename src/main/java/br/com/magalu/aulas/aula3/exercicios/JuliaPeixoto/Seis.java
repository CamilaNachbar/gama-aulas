package br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto;

import java.util.Scanner;

public class Seis {

    public void exercicio6() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a altura: ");
        double altura = sc.nextDouble();
        System.out.print("Escreva a base: ");
        double base = sc.nextDouble();

        double area = base * altura;

        System.out.print("Area: " + area);

        sc.close();

    }

}
