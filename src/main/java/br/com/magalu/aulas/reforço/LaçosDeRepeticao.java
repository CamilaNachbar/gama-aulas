package br.com.magalu.aulas.reforço;

import java.util.ArrayList;
import java.util.List;

public class LaçosDeRepeticao {

    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaWhile() {
        System.out.println("Estrutura WHILE: ");

        // o while tem a caracteristica de executar a condição enquanto ela for verdadeira
        int valor = 1;

        while (valor >= 10) {
            valor++;
            System.out.println("Executa se verdadeira a condição: " + valor);
        }
        System.out.println("Finalizou o bloco: " + valor);

    }

    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaDOWhile() {
        System.out.println("Estrutura DOWHILE: ");

        // o do while tem a caracteristica de primeiro executar a condição e depois executar novamente caso ela seja verdadeira
        int valor = 1;

        //inicia bloco
        do { //executa depois depois verifica
            valor++;
            System.out.println("Executa se verdadeira a condição: " + valor);
        } while (valor >= 10); // volta
        //fecha o bloco

        System.out.println("Finalizou o bloco: " + valor);

    }

    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaForComListas() {
        System.out.println("Estrutura For: ");

        // o for percorre uma lista ou Array, seja abaixo:
        List<Integer> listaDeInteiros = new ArrayList<>();

        listaDeInteiros.add(1);
        listaDeInteiros.add(2);
        listaDeInteiros.add(3);

        // criei uma lista com os numeros inteiros 1, 2, 3
        // como podemos percorrer essa lista?????

        // variavel auxiliar i
        //pego o tamanho da lista pelo .size()
        // e cada vez que o bloco for executado adiciona i + 1
        for (int i = 0; listaDeInteiros.size() >= i; i++) {
            //pega a posicao na lista pelo valor do i
            System.out.println(listaDeInteiros.get(i));
        }
    }

    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaForComArray() {
        System.out.println("Estrutura For: ");

        // o for percorre uma lista ou Array, seja abaixo:
        Integer[] arrayDeInteiros = new Integer[2];

        arrayDeInteiros[0] = 1;
        arrayDeInteiros[1] = 2;
        arrayDeInteiros[2] = 3;
        // criei um Array com os numeros inteiros 1, 2, 3
        // como podemos percorrer esse Array?????

        // variavel auxiliar i
        //pego o tamanho da lista pelo .size()
        // e cada vez que o bloco for executado adiciona i + 1
        for (int i = 0; arrayDeInteiros.length >= i; i++) {
            //pega a posicao na lista pelo valor do i
            System.out.println(arrayDeInteiros[i]);
        }
    }


    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaForeachComArray() {
        System.out.println("Estrutura For: ");

        // o for percorre uma lista ou Array, seja abaixo:
        Integer[] arrayDeInteiros = new Integer[2];

        arrayDeInteiros[0] = 1;
        arrayDeInteiros[1] = 2;
        arrayDeInteiros[2] = 3;
        // criei um Array com os numeros inteiros 1, 2, 3
        // como podemos percorrer esse Array?????

        // variavel auxiliar i
        //foreach tem a funcao percorrer um array ou lista sem precisar saber o tamanho dele ou ainda necessitar de uma variavel auxiliar
        for (Integer l : arrayDeInteiros) {
            System.out.println(l.toString());
        }
    }

    private void estruturaForeachComLista() {
        System.out.println("Estrutura For: ");

        // o for percorre uma lista ou Array, seja abaixo:
        List<Integer> listaDeInteiros = new ArrayList<>();

        listaDeInteiros.add(1);
        listaDeInteiros.add(2);
        listaDeInteiros.add(3);

        // criei uma lista com os numeros inteiros 1, 2, 3
        // como podemos percorrer essa lista?????

        // variavel auxiliar i
        //foreach tem a funcao percorrer um array ou lista sem precisar saber o tamanho dele ou ainda necessitar de uma variavel auxiliar
        for (Integer l : listaDeInteiros) {
            System.out.println(l);
        }
    }
}
