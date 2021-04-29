package br.com.magalu.aulas;

import br.com.magalu.aulas.reforço.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a data no seguinte formato   YYYY-MM-DD: ");
        String data = scan.nextLine();
        Data dataClass = new Data(data);

        int comparador = dataClass.compara(LocalDate.of(2022,1,21));
        System.out.println("comparador: "+  comparador);
        System.out.println("DIA" + dataClass.getDate());
        System.out.println("MES: "+ dataClass.getMes());
        System.out.println("ANO: " + dataClass.getYear());

        dataClass.isBissexto();
    }
}
