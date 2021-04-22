package br.com.magalu.aulas.reforço;

public class Variaveis {

    private void variaveisPrimitivas() {
        //Os tipos primitivos são tipos de dados pré-definidos e que ocupam um espaço específico em memória para armazenar o conteúdo. Os tipos de dados/variáveis primitivas no Java são 8:

        //byte, short, char, int, long, float, double e boolean.
        float valorfloat = 111111F;
        short valorShort = 11;
        char valorChar = 'F'; // um unico caracter
        int valorInt = 1; // valor inteiro
        long valorlong = 6546545464L;
        double valordouble = 23133132D;
        boolean valorboolean = false;

        //Todos estes são conhecidos como tipos primitivos e não é possível criar novos tipos primitivos.
        //Os tipos byte, short, char, int e long são tipos numéricos inteiro, ou seja, só podem armazenar valores,
        // como 1, 2, 3, 4 e assim por diante. Valores como 1.2 (com vírgula/ponto) não é permitido. Obs: o char serve para armazenar caracteres, m
        // as também permite receber valores numéricos.
        //Os tipos float e double são tipos de ponto flutuante (aceitam casas decimais), neste caso vão aceitar tanto os números inteiros como 1, 2 ou 3,
        // quanto os números fracionários como 1.2 (um vírgula dois), 4.5 (quatro e meio/quatro vírgula 5), etc…

        //tem uma explicação bem legal nesse link
        // https://mauriciogeneroso.medium.com/java-oca-1z0-808-2-1-tipos-de-dados-vari%C3%A1veis-vari%C3%A1veis-primitivas-e-de-refer%C3%AAncia-c8f007756bc5#:~:text=Os%20tipos%20primitivos%20s%C3%A3o%20tipos,%2C%20float%2C%20double%20e%20boolean.

    }

    private void variaveisUtilizandoWrappers() {
        //Permitem utilizar uma serie de funcionalidades que auxiliam e facilitam a implementaçoes como conversoes das variaveis
        // por exemplo converte de inteiro para texto

        Float valorfloat = 11111111111111F;
        valorfloat.toString();
        Boolean valorBoolean = false;
        valorfloat.toString();


    }

    private void String() {
        String cadeiaDeCaracteres = "";
        // a String tem como objetivo receber uma cadeia de caracteres
    }
}
