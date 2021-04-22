package br.com.magalu.aulas.aula1.testeEmAula;

public class ClasseAula1 {

    public void exercicio1() {
        int a = 10;
        int b = 20;

        int c = a;
        a = b;
        b = c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    protected void a() {
        int a = 10;
        int b = 20;

        System.out.println("b" + b);

        b = 5;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void b() {
        int a = 30;
        int b = 20;

        int c = a + b;

        System.out.println("c" + c);
        b = 10;

        System.out.println("b" + b);
        System.out.println("c" + c);

        c = a + b;

        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);

    }

    public void c() {
        int a = 10;
        int b = 20;

        System.out.println("b" + b);

        int c = a;
        b = c;
        a = b;

        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);

    }

    public Integer d() {

        int a = 30;
        int b = 20;
        Integer e = 20;
        int c = a + b;

        c = e + b;

        System.out.println("c" + c);
        b = 10;

        System.out.println("b" + b);
        System.out.println("c" + c);

        c = a + b;

        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println("c" + c);
        return e;
    }

}
