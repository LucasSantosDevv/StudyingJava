package EstruturasDeControle.Desafios;


import java.util.Scanner;

public class DesafioGPT4 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("Insira um número positivo");
            int a = entrada.nextInt();

            if(a > 0){
                for(int b = a; b > 0; b--) {
                    System.out.println(b);
                }
            }else{
                System.out.println("Insira um número válido\n");
                continue;
            }
            System.out.println("Fim da contagem");
            break;
        }
    entrada.close();
    }
}