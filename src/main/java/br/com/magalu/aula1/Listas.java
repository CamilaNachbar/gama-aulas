package br.com.magalu.aula1;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Daniele");
        nomes.add("Felipe");
        System.out.println(nomes);
       // --------------------------
        System.out.println("Quantidade de itens na lista: " + nomes.size());
        for (String nome:nomes) {
            System.out.println("Entrou na lista");
            System.out.println(nome);
        }
        // --------------------------

        List<Integer> lists = new ArrayList<>();
        lists.add(10);
        lists.add(20);
        System.out.println(lists.stream().mapToInt(Integer::valueOf).sum());

        Integer total = 0;
        for (Integer lista:lists) {
            total += lista;

        }
        System.out.println("Total impresso com for manual: " + total);
    }
}
