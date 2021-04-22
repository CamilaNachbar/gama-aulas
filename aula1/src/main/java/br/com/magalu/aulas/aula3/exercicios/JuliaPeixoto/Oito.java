package br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto;

import java.util.Scanner;

public class Oito {

    public void exercicio8() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("N�mero total de eleitores: ");
        int totalEleitores = sc.nextInt();

        System.out.print("Quantidade de votos v�lidos: ");
        int validos = sc.nextInt();

        System.out.print("Quantidade de votos em branco: ");
        int brancos = sc.nextInt();

        System.out.print("Quantidade de votos nulos:");
        int nulos = sc.nextInt();

        int porcentagemValidos = (validos * 100) / totalEleitores;
        int porcentagemNulos = (nulos * 100) / totalEleitores;
        int porcentagemBrancos = (brancos * 100) / totalEleitores;

        System.out.println("V�lidos: " + porcentagemValidos + "%");
        System.out.println("Brancos: " + porcentagemBrancos + "%");
        System.out.println("Nulos: " + porcentagemNulos + "%");

        sc.close();
    }

}
