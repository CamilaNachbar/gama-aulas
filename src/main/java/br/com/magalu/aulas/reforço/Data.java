package br.com.magalu.aulas.reforço;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;

public class Data {

    private static Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                    + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");


    private LocalDate currentDate = LocalDate.now();
    private LocalDate date;

    public Data(String data) {
        //dd/MM/yyyy
        //vê se a data passada por parametro esta no padrão certo
        try {
        if (DATE_PATTERN.matcher(data).matches()) {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                this.date = LocalDate.parse(data);
                String dataFormatada = this.date.format(formatter);
                System.out.println("LocalDate depois de formatar: " + dataFormatada);

        }
        }catch (Exception e){
            System.out.println("Data invalida");
        }
    }

    public int compara(LocalDate data) {
        //  comparar valor recebido como parametro (data) com a data recorrente ( LocalDate.now() )
        // retornar 0 caso sejam iguais
        // retornar 1 caso recorrente for maior
        // -1 caso data corrente seja menor
        if (data.isEqual(this.currentDate)) {
            return 0;
        } else if (data.isAfter(this.currentDate)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDate() {
        System.out.println(this.date);
        return this.date.getDayOfMonth();
    }

    public int getMes() {
        System.out.println(this.date);
        return this.date.getMonthValue();

    }

    public int getYear() {
        System.out.println(this.date);
        return this.date.getYear();
    }

    public boolean isBissexto() {
        if ((this.date.getYear() % 4 == 0) && (this.date.getYear() % 100 != 0)) {
            return true;
        } else if (this.date.getYear() % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isBissexto(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        } else if (ano % 400 == 0) {
            return true;
        } else {
            return false;

        }
    }
}
