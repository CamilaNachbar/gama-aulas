package br.com.magalu.aulas;

import br.com.magalu.aulas.aula2.CalculadoraComListas;
import br.com.magalu.aulas.aula3.Livraria.Cliente;
import br.com.magalu.aulas.aula3.Livraria.Livraria;
import br.com.magalu.aulas.aula3.TrabalhandoComListas;
import br.com.magalu.aulas.aula3.exercicios.EdileneLopes.Exercicio5;
import br.com.magalu.aulas.aula3.exercicios.GonzalezCarol.Exercicio3;
import br.com.magalu.aulas.aula3.exercicios.GonzalezCarol.Exercicio4;
import br.com.magalu.aulas.aula3.exercicios.JuliaPeixoto.Seis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);

        Livraria livraria = new Livraria();

        livraria.criarListaDeClientes();
        livraria.criarListaDelivros();

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, bem vindo a Livaria 23");
        System.out.println("Você deseja ( 1 ) Alugar - ( 2 ) Devolver livro - ( 3 ) Pesquisar livro");
        Integer escolha = scan.nextInt();

        if(escolha.equals(1)){
            livraria.validaClienteParaAlugar();
        }else if (escolha.equals(2)){
            System.out.println("Você deseja ( 1 ) Alugar ou ( 2 ) Devolver livro");
            livraria.devolverLivro();
        }else if (escolha.equals(3)){
            livraria.listarTodosNaoAlugados();

        } else{
            System.out.println("Opcao não disponivel");
        }



    }


}
