package br.com.magalu.aulas;

import br.com.magalu.aulas.aula3.Livraria.Livraria;
import br.com.magalu.aulas.aula4.herança.Animal;
import br.com.magalu.aulas.aula6.Livraria;
import br.com.magalu.aulas.aula6.Predio;
import br.com.magalu.aulas.reforço.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Scanner;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);

        Livraria livraria = new Livraria();
        livraria.horarioDefechamento();
        livraria.getLocalizacao();
        livraria.setLocalizacao("Avenida Santo Antonio");

        //dia
        //mes
        //ano
        //regex
        //localDate
        Data dataClass = new Data("14/02/2020");

        //
        LocalDate dataParaComparar = LocalDate.of(2020,12,11);
        LocalDate.
        dataClass.compara(dataParaComparar);

    }
}
