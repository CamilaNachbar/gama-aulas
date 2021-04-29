package br.com.magalu.aulas.aula4.herança;

import br.com.magalu.aulas.aula4.ComportamentoAnimal;

//para herdar uma classe em java nós usamos o extends
public class Cachorro extends Mamifero {

    private String nome;
    private String nomeDoDono;

    public String getNome() {
        return nome;
    }

    public void comer(){
        System.out.println("MORDER");
    }

    public void setNome(String nome) {
        System.out.println("passando o nome" + nome);
        this.nome = nome;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }


}
