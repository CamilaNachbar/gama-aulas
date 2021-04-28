package br.com.magalu.aulas.aula4;

//para herdar uma classe em java nós usamos o extends
public class Cachorro extends Mamifero implements ComportamentoAnimal, banco{

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

    @Override
    public void salvar() {
        // eu salvo cachorro
    }

    @Override
    public void atualizar() {
        // atualizo cachorro
    }

    @Override
    public void deletar() {
        // deleto cachorro

    }

    @Override
    public void listar() {

    }
}
