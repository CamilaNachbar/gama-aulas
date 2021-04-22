package br.com.magalu.aulas.aula3.exercicios.GonzalezCarol;

public class Exercicio3 {

    public void letraA(){
        double result1;
        double result2;

        result1 = (4/2f)+(2/4f);
        result2 = 4/2f+2/4f;

        print("A",result1,result2);
    }

    public void letraB(){
        double result1;
        double result2;

        result1 = 4/(2+2)/4f;
        result2 = 4/2+2/4f;
        print("B",result1,result2);


    }

    public void letraC(){
        double result1;
        double result2;

        result1 = (4+2)*2-4f;
        result2 = 4+2*2-4f;
        print("C",result1,result2);


    }

    public void print(String letra, double resultado1, double resultado2){

        System.out.println("--------------LETRA "+letra+"--------------");
        System.out.println("Resultado de A valor1 :"+resultado1);
        System.out.println("Resultado de A valor2 :" +resultado2);

    }
}
