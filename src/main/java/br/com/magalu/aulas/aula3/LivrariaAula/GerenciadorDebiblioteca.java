package br.com.magalu.aulas.aula3.LivrariaAula;


import java.util.*;

public class GerenciadorDebiblioteca {

    List<Cliente> clientesDaBiblioteca = new ArrayList<>();
    ArrayList<Livro> livrosNaoAlugados = new ArrayList<>();

    public void criarListaDeClientes(){
        clientesDaBiblioteca.add(new Cliente("camila", 2));
        clientesDaBiblioteca.add(new Cliente("Ana",1));
        clientesDaBiblioteca.add(new Cliente("Julia", 3));
    }

    public void criarListaDelivros(){
        livrosNaoAlugados.add(new Livro("Rari pedrada na jaca", 1, "JK"));
        livrosNaoAlugados.add(new Livro("Matador de inocentes",2, "JR Martin"));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo", 3, ""));
        livrosNaoAlugados.add(new Livro("Palhaco VESGO 2", 4, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 3", 5, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 4", 6, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 5", 7, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 6", 8, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo: O FINAL", 9, ""));

    }

    public void PercorrerPorTitulo(){
        System.out.println("----------------------------------------");
        for(Livro l: livrosNaoAlugados) {

            System.out.println(l.matricula);
            System.out.println("----------------------------------------");
            System.out.println(l.titulo);
        }
        System.out.println("----------------------------------------");
    }

    public void listarAlugados() {
        List<Livro> livrosAlugados = new ArrayList<>();
        for (Cliente cl : clientesDaBiblioteca) {
            livrosAlugados.addAll(Arrays.asList(cl.livro));
        }
        imprimirLivros(livrosAlugados);
    }


    public void listarNaoAlugados(){
        //chamando meu metodo e passando a lista com valores
        imprimirLivros(livrosNaoAlugados);
    }

    private void imprimirLivros(List<Livro> livrosParaImprimir) {
        for (Livro l : livrosParaImprimir) {
            System.out.println("----------------------------------------");
            System.out.println(l.toString());
            System.out.println("----------------------------------------");
        }
    }
}
