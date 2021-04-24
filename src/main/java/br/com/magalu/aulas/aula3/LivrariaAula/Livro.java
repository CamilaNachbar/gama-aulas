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

    public Livro(){

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
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDateTime dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
