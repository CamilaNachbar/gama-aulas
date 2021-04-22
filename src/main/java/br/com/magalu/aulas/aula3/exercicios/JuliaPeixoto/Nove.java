package br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto;

import java.util.Scanner;

public class Nove {

    public void exercicio9() {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva salario atual do funcionario desejado: ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Percentual de reajuste: ");
        double reajuste = sc.nextDouble();

        double salarioReajustado = (reajuste * salarioAtual / 100) + (salarioAtual);

        System.out.println("Salario com reajuste: R$" + salarioReajustado);

        sc.close();


    }

}
