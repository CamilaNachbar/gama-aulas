package br.com.magalu.aulas.aula3.Livraria;

import java.lang.reflect.Array;
import java.time.LocalDateTime;

public class Cliente {
    public String nome;
    public String matricula;
    public Livros[] livros =  new Livros[2];

    public Cliente(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNovoLivro(Livros livros){
        //procura disponibilidade de locação
        if (this.livros[0] == null) {
            this.livros[0] = livros;
            this.livros[0].dataLocacao = LocalDateTime.now();
        }else if  (this.livros[1] == null){
            this.livros[1] = livros;
            this.livros[0].dataLocacao = LocalDateTime.now();
        }else{
            System.out.println("O cliente precisa devolver um livro");
        }
    }

    public Livros devolverLivro(int matricula){
        //procura livro a ser devolvido
        Livros livros = null;
        if (this.livros[0].matricula == matricula) {
            livros = this.livros[0];
            validarDataDevolucao(this.livros[0]);
            this.livros[0] = null;
        }else if  (this.livros[1].matricula == matricula){
            livros = this.livros[1];
        validarDataDevolucao(this.livros[1]);
            this.livros[1] = null;
        }else{
            System.out.println("Este livro não foi alugado pelo cliente");
        }
        return livros;
    }

    public void validarDataDevolucao(Livros livros){
        LocalDateTime devolucao = livros.dataLocacao.plusDays(2);
        if(devolucao.isBefore(LocalDateTime.now())){
                System.out.println("devolucao sem multa");
        }else{
            System.out.println("devolucao com multa");
        }

    }
}
