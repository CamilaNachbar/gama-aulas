package br.com.magalu.aulas;

import br.com.magalu.aulas.aula2.CalculadoraComListas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);

        List<Integer> list = new ArrayList<Integer>();


        CalculadoraComListas calList = new CalculadoraComListas();
        list.add(calList.somar(12, 10));

        CalculadoraComListas calList2 = new CalculadoraComListas();
        list.add(calList2.somar(24, 465));
    }


}
