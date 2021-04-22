package br.com.magalu.aulas;

import br.com.magalu.aulas.aula2.CalculadoraComListas;
import br.com.magalu.aulas.aula3.TrabalhandoComListas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);

        TrabalhandoComListas listas = new TrabalhandoComListas();
        listas.trabalhandoComArrayList();
    }


}
