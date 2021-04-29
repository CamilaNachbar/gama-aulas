package br.com.magalu.aulas.aula4.herança;

import br.com.magalu.aulas.aula4.ComportamentoAnimal;

import java.time.LocalDateTime;

//super Classe - Classe mãe
public class Animal {

    private String nomeCientifico;
    private String genero;
    private Double peso;
    private String especie;
    private Temperamento temperamento;
    private LocalDateTime dataHoraNascimento;

    public void movimentar(){  }
    public void emitirSom(){}



    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Temperamento getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(Temperamento temperamento) {
        this.temperamento = temperamento;
    }

    public void comer() {
        System.out.println("CAÇAR");
    }


    public void morrer() {
        System.out.println("MORREU");

    }

    public void procriar() {
        System.out.println("FEZ FILHOTES");

    }
}
