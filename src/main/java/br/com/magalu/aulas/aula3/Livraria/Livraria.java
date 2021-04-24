package br.com.magalu.aulas.aula3.Livraria;


import br.com.magalu.aulas.aula3.LivrariaAula.Livro;

import java.util.*;

public class Livraria {

    public List<Cliente> clientes = new ArrayList<>();
    public List<Livros> livrosNaoAlugados = new ArrayList<>();

    Scanner scan = new Scanner(System.in);


    public void criarListaDeClientes(){
        clientes.add(new Cliente("camila", "123"));
        clientes.add(new Cliente("Ana","124"));
        clientes.add(new Cliente("Julia", "1234"));
    }

    public void criarListaDelivros(){
        livrosNaoAlugados.add(new Livro("Rati pedrada na jaca", 1, "JK"));
        livrosNaoAlugados.add(new Livro("Matador de inocentes",2, "JR Martin"));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo", 3, ""));
        livrosNaoAlugados.add(new Livro("Palhaco VESGO 2", 4, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 3", 5, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 4", 6, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 5", 7, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo 6", 8, ""));
        livrosNaoAlugados.add(new Livro("Palhaco vesgo: O FINAL", 9, ""));

    }

    public Cliente buscaCliente(String matricula){
        for (Cliente cliente: clientes) {
            if (cliente.matricula == matricula) {
                return cliente;
            }
        }
        return null;
    }

    public Livros buscaLivro(int matricula){
        for (Livros l: livrosNaoAlugados) {
            if (l.matricula == matricula) {
                return l;
            }
        }
        return null;
    }

    public Livros buscaClientePelaMatriculaDoLivro(String matriculaDoCliente, int matriculaLivro){
      Cliente clientesDevolvendoLivro = buscaCliente(matriculaDoCliente);

            for (Livros l: clientesDevolvendoLivro.livros){
                //compara a matricula unica
               if( l.matricula == matriculaLivro){
                 return l;
               }
            }
            clientesDevolvendoLivro.devolverLivro(matriculaLivro);
            return null;
    }


    public void validaClienteParaAlugar(){
        System.out.println("Entre com a matricula do Cliente");
        String matriculaDoCliente = scan.next();

        Cliente client = buscaCliente(matriculaDoCliente);

        if(client != null){
            validaLivro(client);
        } else {
         Cliente novoCliente = adicionaNovoCliente();
         validaLivro(novoCliente);

        }
    }

    public void validaLivro(Cliente cliente){
        System.out.println("Entre com a matricula do livro a ser alugado");
        int matriculaDoLivro = scan.nextInt();

        Livros l = buscaLivro(matriculaDoLivro);

        //livro não é nullo, ele existe
        if(l != null) {
            //adiciona ao cliente
            cliente.adicionarNovoLivro(l);
            //remove da lista de livros não alugados
            this.livrosNaoAlugados.remove(l);
        }else {
            System.out.println("Livro não existe");
        }
    }

    public void devolverLivro(){
        System.out.println("Entre com a matricula do cliente: ");
        String matriculaDoCliente = scan.next();

        System.out.println("Entre com a matricula do livro a ser devolvido: ");
        int matriculaDoLivro = scan.nextInt();

        Livros livro = buscaClientePelaMatriculaDoLivro(matriculaDoCliente, matriculaDoLivro);
        this.livrosNaoAlugados.add(livro);

    }

    public Cliente adicionaNovoCliente() {
        System.out.println("Deseja incluir novo cliente? S - 1 / N - 2");
        int aceite = scan.nextInt();

        if (aceite == 1){
            System.out.println("Entre com o nome: ");
            String nome = scan.next();

           return new Cliente(nome, geradaNovaMatricula());
        }else {
            scan.close();
            Runtime.getRuntime().exit(1);
            return null;
        }
    }

    public String geradaNovaMatricula(){
        return UUID.randomUUID().toString();
    }


    public void listarTodosNaoAlugados(){
        for (Livros l: livrosNaoAlugados) {
            System.out.println("----------------------------------------");
            System.out.println("matricula: " + l.matricula);
            System.out.println("nome: " + l.nome);
            System.out.println("autor: " + l.autor);
            System.out.println("----------------------------------------");
        }
    }
}
