package br.com.magalu.aula1;

public class Calculadora {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Float a2;
    public Float b2;

    public Calculadora() {
    }

    public Calculadora(Integer a, Integer b, Integer c, Integer d) {
        this.somar(a,c);
    }

    public Calculadora(Float a2, Float b2) {
        this.somar2();
    }

    public Integer somar(Integer a, Integer c) {
        return this.a + this.c;
    }

    public Integer somar() {
        return this.a + this.b + this.c + this.d;
    }

    public Float somar2() {
        return this.a2 + this.b2;
    }

    public Integer subtrair() {

        return this.a - this.b;
    }

    public Integer dividir() {
        return this.c / this.d;
    }

    public Integer multiplicar() {
        return this.a * this.c;
    }
}