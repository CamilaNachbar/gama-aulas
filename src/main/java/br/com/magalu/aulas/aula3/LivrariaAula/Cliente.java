package br.com.magalu.aulas.aula3.LivrariaAula;


public class Cliente {

    public String nome;
    public int matricula;
    public Livro[] livro = new Livro[2];

    public Cliente(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    // Um cliente não pode estar com mais de 2 livros
    // Não pode haver dois alugueis para o mesmo livro ao mesmo tempo
    // Cliente deve ter nome, matricula e lista de livros

    //quando eu tenho um objeto que possui 1 atributo true, como eu imprimo esse objeto de dentro da lista?

}
