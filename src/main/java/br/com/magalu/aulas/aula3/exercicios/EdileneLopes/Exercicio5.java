package br.com.magalu.aulas.aula3.exercicios.EdileneLopes;

import java.util.Scanner;

public class Exercicio5 {

    public void escrever() {
        System.out.println("-----Exercicio 05 -------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();

        System.out.println("Esse é o antecessor: " + (num-1));

    }
}
