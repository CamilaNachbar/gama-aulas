package br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto;

import java.util.Scanner;

public class Onze {

    public void exercicio11() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("N�mero de carros vendidos (m�s): ");
        int numeroCarros = sc.nextInt();

        System.out.print("Valor total de suas vendas (m�s): ");
        double valorCarros = sc.nextDouble();

        System.out.print("Qual seu sal�rio fixo R$ ");
        double salario = sc.nextDouble();

        System.out.print("Valor unit�rio por carro vendido R$ ");
        double valorCarroVendido = sc.nextDouble();

        double comissaoCarroVendido = numeroCarros * valorCarroVendido;
        double comissaoVenda = valorCarros * (5 / 100);
        double salarioFinal = salario + comissaoCarroVendido + comissaoVenda;

        System.out.println("Sal�rio Final R$ " + salarioFinal);

        sc.close();

    }

}
