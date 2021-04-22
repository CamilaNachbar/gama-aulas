package br.com.magalu.aulas.aula2;

public class Calculadora {

    public Integer a, b;

    public Calculadora() {
        System.out.println("Opa criou 1");
        imprimirDuranteOConstrutor();
    }

    public Calculadora(Integer a, Integer b) {
        System.out.println("Opa chamou o segundo contrustor");
        listar();
    }

    public void imprimirDuranteOConstrutor() {
        System.out.println("Durante o construtor");

    }

    public void imprimirDepoisDoConstrutor() {
        System.out.println("Depois do construtor");
    }

    public void somar() {
        Integer c = a + b;
        printar(a.toString(), b.toString(), c.toString());
    }

    public Integer somar(Integer a, Integer b) {
        Integer c = a + b;
        printar(a.toString(), b.toString(), c.toString());
        return c;
    }

    public Float somar(Float a, Float b) {
        Float c = a + b;
        return c;
    }

    public void subtrair(Integer a, Integer b) {
        Integer c = a - b;
        printar(a.toString(), b.toString(), c.toString());

    }

    public void dividir(Integer a, Integer b) {
        Integer c = a / b;
        printar(a.toString(), b.toString(), c.toString());
    }

    public void multiplicar(Integer a, Integer b) {
        Integer c = a * b;
        printar(a.toString(), b.toString(), c.toString());

    }

    public void listar() {
    }

    public void printar(String a, String b, String c) {
        System.out.println("valor A " + a);
        System.out.println("valor B " + b);
        System.out.println("valor C " + c);

    }

    public void historicoDeOperacoes() {
    }
}
