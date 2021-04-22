package br.com.magalu.aula2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula2Application {
		public static void main (String args[]) {
			SpringApplication.run(Aula2Application.class, args);

			//Instanciando o objeto
			Calculadora calcI = new Calculadora(2,4,3,5);

			//Instanciando o objeto
			Calculadora calcf = new Calculadora(2.3f,4.2f);

			System.out.println("O histórico dos valores é: ");
			//chamando o historico float
			calcf.listarHistorico();

			//chamando o historico integer
			calcI.listarHistorico();
		}

}


