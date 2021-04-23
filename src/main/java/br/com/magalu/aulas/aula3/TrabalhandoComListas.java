package br.com.magalu.aulas.aula3;

import br.com.magalu.aulas.aula3.Livraria.Cliente;
import br.com.magalu.aulas.aula3.escola.Aluno;
import br.com.magalu.aulas.aula3.exercicios.GonzalezCarol.Print;

import java.util.*;

public class TrabalhandoComListas {

    //Tem o tamanho fixo, temos que declarar o seu tamanho ao cria-ló
    //É uma estrutura de dados nativa do core do Java
    //Tem seus valores acessados por []
    //Pode armazenar tanto tipos primitivos como objetos

    //Para adicionar valores ao Array, devemos escolher a posição através do índice. Veja como fica a atribuição no Array de Inteiros.

    private void trabalhandoComArray(){
        String[] vetorNomes = new String [10]; // Array de Strings
        Integer[] vetorDeInteiros = new Integer [10]; // Array de Strings

        int[] vetorPrimitivo = new int[10];

        vetorNomes[0] = "Camila";
        vetorNomes[1] = "jaque";


        Arrays.sort(vetorNomes);
        Arrays.sort(vetorNomes, Collections.reverseOrder());
        //https://www.devmedia.com.br/ordenando-arrays-em-java/28779#:~:text=N%C3%A3o%20h%C3%A1%20nada%20de%20especial,%C3%A9%20implementada%20pelo%20m%C3%A9todo%20CompareTo
    }

    //
    public void trabalhandoComArrayList(){

      //  Tem tamanho dinâmico, não é obrigatório declarar seu tamanho em sua instanciação
      //  Faz parte do framework Collection, sendo uma implementação da interface List
        //  Tem seus valores acessados por metodos, ex: get()
        //  Não suporta tipos primitivos, apenas objetos

       // Os ArrayLists são coleções de dados que podem aumentar e diminuir dinamicamente, além de permitir a inserção de qualquer tipo de dado, no mesmo ArrayList (inteiros, Strings, Decimais e etc).

        //Lista de aluno
        List<Cliente> listaDeAlunos = new ArrayList<>();

        //Cliente aluno1 = new Cliente();
        //aluno1.nome ="Camila" ;
       // aluno1.matricula = "1";

       // Cliente aluno2 = new Cliente();
     //   aluno2.nome ="Vanessa" ;
     //   aluno2.matricula = "2";


      //  Cliente aluno3 = new Cliente();
      //  aluno3.nome ="Julia" ;
      //  aluno3.matricula = "3";

      //  Cliente aluno4 = new Cliente();
      //  aluno4.nome ="Ana" ;
      //  aluno4.matricula ="4" ;

      //  listaDeAlunos.add(aluno1);
     //   listaDeAlunos.add(aluno2);
     //   listaDeAlunos.add(aluno3);
     //   listaDeAlunos.add(aluno4);

        for (int i= 0; listaDeAlunos.size() >= i ; i++) {
            System.out.println("posicao" + i);
            System.out.println("nome: " + listaDeAlunos.get(i).nome);
            System.out.println("matricula: " + listaDeAlunos.get(i).matricula);
        }

        //https://www.alura.com.br/artigos/ordenando-uma-lista-de-objetos-em-java?gclid=Cj0KCQjwvYSEBhDjARIsAJMn0lj10i9jJ6cSC_1q0dD8eXYsW9bxpmICfZOhAPuQcQ55TKnM5QcVwdMaAkKEEALw_wcB
        //https://pt.stackoverflow.com/questions/245129/ordenar-alfabeticamente-um-arraylist
    }

    public void trabalhandoHashMap(){
        //ArrayList
        // é um conjunto de elementos de um tipo definido. É uma estrutura ordenada de dados, ou seja, os valores podem ser acessados por seus índices.

        //HashMap
        //É um conjunto de pares de chave-valor, para cada elemento (valor) salvo num HashMap deve existir uma chave única atrelada a ele. Os elementos num HashMap devem ser acessados por suas chaves.

        HashMap<String, Cliente> hashMap = new HashMap<>();

    //    Cliente aluno1 = new Cliente();
    //    aluno1.nome ="Camila" ;
   //     aluno1.matricula = "1";

    //    Cliente aluno2 = new Cliente();
    //    aluno2.nome ="Vanessa" ;
    //    aluno2.matricula = "2";

     //   hashMap.put("a",aluno1);
     //   hashMap.put("b",aluno2);

        for (String i : hashMap.keySet()) {
            System.out.println("CHAVE " + i);
            System.out.println("VALOR - CLIENTE nome: " + hashMap.get(i).nome);
            System.out.println("VALOR - CLIENTE matricula: " + hashMap.get(i).matricula);
        }

    }

    //https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162
    //https://www.devmedia.com.br/java-collections-como-utilizar-collections/18450

}
