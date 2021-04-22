package br.com.magalu.aulas.aula3;

import br.com.magalu.aulas.aula3.Livraria.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrabalhandoComListas {

    //Tem o tamanho fixo, temos que declarar o seu tamanho ao cria-ló
    //É uma estrutura de dados nativa do core do Java
    //Tem seus valores acessados por []
    //Pode armazenar tanto tipos primitivos como objetos

    //Para adicionar valores ao Array, devemos escolher a posição através do índice. Veja como fica a atribuição no Array de Inteiros.
    private void trabalhandoComArray(){
        String[] vetorNomes = new String [10]; // Array de Strings
        Integer[] vetorDeInteiros = new Integer [10]; // Array de Strings

        vetorNomes[0] = "Camila";
    }

    //
    private void trabalhandoComArrayList(){

      //  Tem tamanho dinâmico, não é obrigatório declarar seu tamanho em sua instanciação
      //  Faz parte do framework Collection, sendo uma implementação da interface List
        //  Tem seus valores acessados por metodos, ex: get()
        //  Não suporta tipos primitivos, apenas objetos

       // Os ArrayLists são coleções de dados que podem aumentar e diminuir dinamicamente, além de permitir a inserção de qualquer tipo de dado, no mesmo ArrayList (inteiros, Strings, Decimais e etc).
        ArrayList<Object> arrayListObjetoGenerico = new ArrayList<>();

        List<Object> listaDeObjetosGenericos = new ArrayList<>();
        Cliente aluno = new Cliente();
        aluno.nome ="Camila" ;

        listaDeObjetosGenericos.add(10);
        listaDeObjetosGenericos.add("teste");
        listaDeObjetosGenericos.add(aluno);

        //Lista de alunos
        List<Object> listaDeAlunos = new ArrayList<>();

        Cliente aluno0 = new Cliente();
        aluno0.nome ="Camila" ;

        Cliente aluno1 = new Cliente();
        aluno1.nome ="Julia" ;

        Cliente aluno2 = new Cliente();
        aluno2.nome ="Ana" ;

        listaDeAlunos.add(aluno0);
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);

    }

    private void trabalhandoHashMap(){
        //ArrayList
        // é um conjunto de elementos de um tipo definido. É uma estrutura ordenada de dados, ou seja, os valores podem ser acessados por seus índices.

        //HashMap
        //É um conjunto de pares de chave-valor, para cada elemento (valor) salvo num HashMap deve existir uma chave única atrelada a ele. Os elementos num HashMap devem ser acessados por suas chaves.

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Stack");
        hashMap.put(5, "Overflow");
    }

    //https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162


}
