package br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto;

import java.util.Scanner;

public class Sete {

    public void exercicio7() {

        int dias;
        int meses;
        int anos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade.");
        System.out.print("Anos: ");
        anos = sc.nextInt();

        System.out.print("Meses: ");
        meses = sc.nextInt();

        System.out.print("Dias: ");
        dias = sc.nextInt();

        dias += (anos * 365) + (meses * 30);

        System.out.println("A sua idade em dias � " + dias);

        sc.close();
    }

}
