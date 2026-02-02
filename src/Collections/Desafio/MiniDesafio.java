package Collections.Desafio;

//DESAFIO: criar um jogo simples visando ligar o 'scanner' com uma lista de armazenagem

import java.util.Scanner;
import java.util.TreeSet;

public class MiniDesafio {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        TreeSet<String> nomes = new TreeSet<>();

        System.out.println("Insira um nome masculino para cada letra do alfabeto");

        for(int a = 0; a < 26; a++){
            while(true) {
            char letraInicial = (char) ('A' + a);
            System.out.print(letraInicial + ": ");
            String nome = entrada.nextLine().toUpperCase();
            nomes.add(nome);
                if (nome.isEmpty()) {
                    System.out.println("Você precisa digitar algo!");
                }else{
                    break;
                }
            }
        }
        System.out.println("\n----- Os nomes listados foram -----");
        for(String list : nomes){
            System.out.println(list);
        }
    }
}
