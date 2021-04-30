package br.com.magalu.aulas.aula7;

//Extende as caracteristicas da Exception
public class DataException extends Exception {

    public DataException() {
        getMessage();
    }

    public String getMessage(){
        return "atributo vazio";
    }

    public String getMessage(String message){
        return message;
    }

    public String getMessageDia(){
        return "Dia maior que 31";
    }
    public String getMessageMes(){
        return "mes maior que 12";
    }

    public String getMessageAnoBissexto(){
        return "Este ano é bissexto";
    }


}
