package br.com.magalu.aulas.aula4;

public class Encapsulamento {

  private static final String teste = "TEST";

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //Esse encapsulamento de atributos e métodos impede o chamado vazamento de escopo,
    // onde um atributo ou método é visível por alguém que não deveria vê-lo,
    // como outro objeto ou classe. Isso evita a confusão do uso de variáveis globais no programa,
    // deixando mais fácil de identificar em qual estado cada variável vai estar a cada momento do programa,
    // já que a restrição de acesso nos permite identificar quem consegue modificá-la.


}
