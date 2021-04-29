package br.com.magalu.aulas.reforço;


import jdk.vm.ci.meta.Local;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Data {

    private LocalDate date = LocalDate.now();

    public Data(String data){
        //dd/MM/yyyy
        //vê se a data passada por parametro esta no padrão certo
        DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        //  (0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)
       try{
           String date = formatter.format(data);
       }catch (Exception e){
                System.out.println("Estorou exception");
       }

    }

    public int compara(LocalDate data){
    //  comparar valor recebido como parametro (data) com a data recorrente ( LocalDate.now() )
        // retornar 0 caso sejam iguais
        // retornar 1 caso recorrente for maior
        // -1 caso data corrente seja menor
        if(data.isEqual(this.date)){
            return 0;
        }else if (data.isAfter(this.date)){
           return 1;
        }else {
            return -1;
        }
    }

}
