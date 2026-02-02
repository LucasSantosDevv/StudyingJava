package EstruturasDeControle;

//'While', diferentemente do 'for', é principalmente usado para loops de repetição indeterminada

import java.util.Scanner;

public class While {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        while(!texto.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            texto = entrada.nextLine();
            if(!texto.equalsIgnoreCase("sair")) {
                System.out.println("tente novamente\n");
            }
        }
        entrada.close();
    }
}
