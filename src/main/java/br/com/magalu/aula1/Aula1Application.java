package br.com.magalu.aula1;

import br.com.magalu.aula1.aula2.Calculadora;
import br.com.magalu.aula1.testeEmAula.ClasseAula1;
import com.sun.tools.jdeprscan.scan.Scan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Scanner;

@SpringBootApplication
public class Aula1Application {

	public static void main(String[] args) throws Exception, IOException {
		SpringApplication.run(Aula1Application.class, args);


		Calculadora cal = new Calculadora();
		cal.imprimirDepoisDoConstrutor();



	}



}
