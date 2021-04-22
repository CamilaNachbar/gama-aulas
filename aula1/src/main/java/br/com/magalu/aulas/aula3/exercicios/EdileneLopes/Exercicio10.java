package br.com.magalu.aulas.aula3.exercicios.EdileneLopes;

import java.util.Scanner;

public class Exercicio10 {

    public void precoCarro() {

        System.out.println("-----Exercicio 10 -------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o custo de fabricação do veículo:");
        double custoFabrica = scan.nextDouble();


        double distribuidor = 0.28 * custoFabrica;
        double imposto = 0.45 * custoFabrica;
        double valorVeiculo = distribuidor + custoFabrica + imposto;

        System.out.println("Distribuidor:" + distribuidor);
        System.out.println("Imposto: "+ imposto);
        System.out.println("Valor total do veículo :" + valorVeiculo);

    }
}
