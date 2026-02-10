package Excecoes;

/* Finally é usado junto com o "try / catch" quando queremos garantir que mesmo havendo um erro, que o programa chegue
naquele ponto do código */

import java.util.Scanner;
public class Finally {

    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        IO.println("Digite qualquer número");
        try {
            IO.println(7 / entrada.nextInt());
        } catch (Exception a){
            IO.println("Identificação do erro: " + a.getMessage());
        } finally {
            IO.println("\nFinally: Ainda assim chega aqui...");
        }
        IO.println("\nFim do programa");
    }
}
