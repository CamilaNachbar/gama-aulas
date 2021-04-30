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
        String dataString = scan.nextLine();
        Data data = new Data(dataString);
        data.getDate();
        data.compara(LocalDate.now());
    }
}
