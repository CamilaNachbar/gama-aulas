package br.com.magalu.aulas.aula3.exercicios.GonzalezCarol;

public class Exercicio4 {



    public void letraA(){
        double primeiraCondicao = 6f*(3+2);
        double segundaCondicao = 6*5f;

        new Print("A", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);


    }

    public void letraB(){
        double primeiraCondicao = 2+(6f*(3+2));
        double segundaCondicao = 2+30;

        new Print("B", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraC(){
        double primeiraCondicao = 2+(3*6f)/(2+4);
        double segundaCondicao = 2+18/6f;

        new Print("C", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }
    public void letraD(){
        double primeiraCondicao = 2f*(8f/(3+1));
        double segundaCondicao = 2*2f;

        new Print("D", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraE(){
        double primeiraCondicao = 3+(16-2)/(2f*(9-2));
        double segundaCondicao = 3+(14)/14;

        new Print("E", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraF(){
        double primeiraCondicao = (6/3)+(8/2);
        double segundaCondicao = 2+4;

        new Print("F", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraG(){
        double primeiraCondicao = ((3+(8/2))*4f)+(3*2f) ;
        double segundaCondicao = (7*4f)+6;

        new Print("G", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }
    public void letraH(){
        double primeiraCondicao = (6*(3*3f)+6)-10  ;
        double segundaCondicao = 54+6-10;

        new Print("H", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraI(){
        double primeiraCondicao = (((10*8f)+3)*9)   ;
        double segundaCondicao = (80+3)*9f;

     new Print("I", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);

    }

    public void letraJ(){
        double primeiraCondicao = ((-12)*(-4))+(3*(-4))    ;
        double segundaCondicao = 48+-12;

        new Print("J", primeiraCondicao, segundaCondicao);
        comparaValores(primeiraCondicao, segundaCondicao);
    }

    public void comparaValores(double result1, double result2){
        if(result1 == result2){
            System.out.println("valor iguais");
        }else {
            System.out.println("valor diferentes");

        }
    }
}
