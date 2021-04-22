package br.com.magalu.aulas.reforço;

public class TrabalhandoCondicionais {

    //modificador de acesso privado
    // retorno void, ou seja, não precisa retornar nada
    // nome do metodo
    private void estruturaDoIf() {
        System.out.println("Estrutura do IF");

        boolean aTrue = true;
        boolean aFalse = false;

        //o if tem a condiçao que sempre que uma condição
        // for verdadeira ele executa o condição e sai do bloco de execução


        System.out.println("SEGUNDO IF");
        // começa o bloco de execuçao
        if (aFalse) {
            //não entra aqui por que é false
            System.out.println("condição else");
        } else if (aFalse || aFalse) {
            //aqui foi usado a condição relacional OU "||", nela uma das duas condiçoes devem ser verdadeiras
            System.out.println("condição if com OU");

        } else if (aFalse && aTrue) {
            //aqui foi usado a condição relacional E "&&", nela as duas condiçoes devem ser verdadeiras
            System.out.println("condição if com &&");

        } else {
            // dentro do else sem nenhuma condição se cada uma dos ifs anteriores não for verdadeiro ele cai aqui
            // faça o teste
            System.out.println("condição else");
        }
        // termina o bloco de execuçao


        System.out.println("SEGUNDO IF");
        // começa novo bloco de execuçao
        // o que acontece aqui????????????????
        if (aTrue) {
            //não entra aqui por que é false
            System.out.println("condição if");
        } else if (aFalse || aFalse) {
            //aqui foi usado a condição relacional OU "||", nela uma das duas condiçoes devem ser verdadeiras
            System.out.println("condição if com OU");

        } else if (aFalse && aTrue) {
            //aqui foi usado a condição relacional E "&&", nela as duas condiçoes devem ser verdadeiras
            System.out.println("condição if com &&");
        } else {
            // dentro do else sem nenhuma condição se cada uma dos ifs anteriores não for verdadeiro ele cai aqui
            // faça o teste
            System.out.println("condição else");
        }
        // termina o bloco de execuçao

    }

    private void estruturaDoSwitchCase() {
        //O condicional switch testa o valor contido em uma variável e
        // o compara com os valores fornecidos em cada caso, representados pela palavra reservada case.
        // Podemos ter quantos casos forem necessários na estrutura, e quando um dos valores corresponder ao da variável de teste, o código do caso será executado


        // Para evitar que as comparações continuem a ser executadas após um caso correspondente ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos.
        String aTrue = "";
        switch (aTrue) {
            case "janeiro":
                System.out.println("janeiro");
                break;
            case "feveiro":
                System.out.println("fevereiro");
                break;
            default:
                System.out.println("CAIU NO BREAK");
                break;
        }
    }

}
