package br.com.magalu.aulas.reforço;

import java.util.Scanner;

public class TryCatchFinally {

    public TryCatchFinally(){

        try {
            Scanner scan = new Scanner(System.in);
            Double valor =scan.nextDouble();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            Scanner scan2 = new Scanner(System.in);
            // a o ultimo bloco a sempre ser executado
            // finally sempre tem que estar trabalhando em conjunto com um try/catch
            Double valor = scan2.nextDouble();
        }
    }
}
