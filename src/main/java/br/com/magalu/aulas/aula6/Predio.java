package br.com.magalu.aulas.aula6;

public abstract class Predio {

    // uma classe abstrata serve como modelo de suas classes filhas, a classe abstrata não pode ser instanciada.
    // a classe abstrata diferentemente da interface pode conter atributos
    // e comportamentos e não somente a assinatura deles

    private String localizacao;

    public void horarioDefechamento(){
        System.out.println("Fecha as 18:00");
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
