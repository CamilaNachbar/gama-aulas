package br.com.magalu.aulas.aula3.Livraria;

import java.lang.reflect.Array;
import java.time.LocalDateTime;

public class Cliente {
    public String nome;
    public String matricula;
    public Livros[] livros =  new Livros[2];


    //SobrecargaDemetodo/construtor
    // contem a mesma denominação mas comportamnetos diferentes
    public Cliente(String nome){
        System.out.println("nome" + nome);
    }

    public Cliente(){
    }


    public Cliente(String nome, String matricula){
        //this <- referencia atributos da classe
        // usado quando valores são passados
        // por metodos/construtor contento o mesmo nome do atributo da classe
        //this.sobrenome == atributo da classe
        // sobrenome == atributo recebido pelo metodo/construtor
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNovoLivro(Livros livros){
        //procura disponibilidade de locação
        if (this.livros[0] == null) {
            this.livros[0] = livros;
            this.livros[0].dataLocacao = LocalDateTime.now();
            //passa para cliente o livro e a data na posicao 0
        }else if  (this.livros[1] == null){
            this.livros[1] = livros;
            this.livros[0].dataLocacao = LocalDateTime.now();
        }else{
            System.out.println("O cliente precisa devolver um livro");
        }
    }

    public void devolverLivro(int matricula){
        //procura livro a ser devolvido
        if (this.livros[0].matricula == matricula) {
            validarDataDevolucao(this.livros[0]);
            this.livros[0] = null;
        }else if  (this.livros[1].matricula == matricula){
        validarDataDevolucao(this.livros[1]);
            this.livros[1] = null;
        }else{
            System.out.println("Este livro não foi alugado pelo cliente");
        }
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
