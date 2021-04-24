package br.com.magalu.aulas.aula3.LivrariaAula;

import java.time.LocalDateTime;

public class Livro {

    int matricula;
    String titulo;
    LocalDateTime dataLocacao;
    LocalDateTime dataDevolucao;
    String autor;
    boolean status;
    Integer quantidade;


    public Livro(String nome, int matricula, String autor){

    }

    public void ordenarPorNome(){}
    public void listarAlugados(){}


    @Override
    public String toString() {
        return "Livro{" +
                "matricula=" + matricula +
                ", titulo='" + titulo + '\'' +
                ", dataLocacao=" + dataLocacao +
                ", dataDevolucao=" + dataDevolucao +
                ", autor='" + autor + '\'' +
                ", status=" + status +
                ", quantidade=" + quantidade +
                '}';
    }


    //crie um metodo para ordenar os livros por nome
    //crie um metodo para lista os livros alugados

}
