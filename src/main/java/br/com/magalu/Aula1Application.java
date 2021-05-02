package br.com.magalu;

import br.com.magalu.aula1.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class Aula1Application {

	public static void main(String[] args) throws Exception, IOException {
		SpringApplication.run(Aula1Application.class, args);

		Calculadora cal = new Calculadora();
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com seu nome: ");
		String nome = scan.next();

		System.out.println("Olá: " + nome);

		System.out.println("Entre com o valor de A: ");
		cal.a = scan.nextInt();

		System.out.println("Entre com o valor de B: ");
		cal.b = scan.nextInt();

		System.out.println("Entre com o valor de C: ");
		cal.c = scan.nextInt();

		System.out.println("Entre com o valor de D: ");
		cal.d = scan.nextInt();

		System.out.println("Entre com o valor de A2: ");
		cal.a2 = scan.nextFloat();

		System.out.println("Entre com o valor de B2: ");
		cal.b2 = scan.nextFloat();

		System.out.println("Somando primeiro construtor: " + cal.somar());
		System.out.println("Somando primeiro construtor: " + cal.somar2());
		System.out.println("Subtraindo: " + cal.subtrair());
		System.out.println("Dividindo: " + cal.dividir());
		System.out.println("Multiplicando: " + cal.multiplicar());
	}
}