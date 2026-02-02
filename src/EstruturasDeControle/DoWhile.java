package EstruturasDeControle;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do{
           System.out.println("Deseja sair?");
           System.out.println("Quais são as palavras mágicas?\n");
           texto = entrada.nextLine();
            if(texto.equalsIgnoreCase("vtnc")){
                System.out.println("Vai Você\n");
            }else if (texto.equalsIgnoreCase("vai toma no cu")) {
                System.out.println("Vai Você\n");
            }else if (texto.equalsIgnoreCase("vsf")) {
                System.out.println("Vai Você\n");
            }else if (texto.equalsIgnoreCase("fdp")) {
                System.out.println("Você que é\n");
            }
        }while(!texto.equalsIgnoreCase("por favor"));

        System.out.println("Obrigado!");
        entrada.close();
    }
}
