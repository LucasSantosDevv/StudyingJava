package EstruturasDeControle.Desafios;

/*DESAFIO: criar uma calculadora de médias usando o 'while'.
Parâmetros: - armazenar quantas notas quiser;
- para usando o comando -1;                                                                                       */

import java.util.Scanner;

public class While {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double total = 0;
        int quantidade = 0; //duas variáveis (uma para armazenar a quantidade de notas e outra para o total das notas)

        System.out.println("  ---   Calculadora de média   ---   \n");

        while(true) {    //abertura do loop de repetição para inserção das notas

            System.out.println("Insira a nota (ou -1 para sair)");
            String NOTA = entrada.nextLine().replace(",",".");
            double nota = Double.parseDouble(NOTA);   //criação da variável da nota inserida pelo utilizador

            if(nota == -1){     //criação do 'freio' do sistema
                break;
            }else if (nota >= 0 && nota <= 10) {     //criação do parâmetro das notas válidas
                quantidade++;      //em caso de nota válida, comando para somar 1 a quantidade de notas
                total += nota;      //em caso de nota válida, comando para somar o valor ao total das notas
            }else{      //em caso de nota não válida, mandar a seguinte mensagem
                System.out.println("Insira uma nota válida");
            }

        }     //fim do loop

        if(quantidade > 0){
            double media = total / quantidade; //criação da variável para dividir o total das notas por sua quantidade
            System.out.printf("sua média é: %.2f", media);
        }else{
            System.out.println("Nenhuma nota válida registrada");
        }

        entrada.close();
    }
}
