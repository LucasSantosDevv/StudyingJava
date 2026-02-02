package EstruturasDeControle.Desafios;

import java.util.Scanner;

public class IfElse {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia da semana: (Exemplo: segunda)");
        String dias = entrada.nextLine().toLowerCase();
        if(dias.equals("segunda")) {
            System.out.println(1);
        }else if(dias.equals("terça")){
            System.out.println(2);
        }else if(dias.equals("terca")){
                System.out.println(2);
        }else if(dias.equals("quarta")){
            System.out.println(3);
        }else if(dias.equals("quinta")){
            System.out.println(4);
        }else if(dias.equals("sexta")){
            System.out.println(5);
        }else if(dias.equals("sábado")) {
            System.out.println(6);
        }else if(dias.equals("sabado")){
                System.out.println(6);
        }else if(dias.equals("domingo")){
            System.out.println(7);
        }else{
            System.out.println("insira um dia válido");
        }

        entrada.close();
    }
}
