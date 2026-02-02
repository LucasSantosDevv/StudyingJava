package Lambdas.InterfacesFuncionais.Desafios;
/* 1. Você tem um array de inteiros digitados pelo usuário.
- Crie 3 Predicates usando lambda:
- Um que verifique se o número é par
- Um que verifique se o número é maior que 50
- Um que verifique se o número é negativo
2. Percorra o array usando for ou forEach e, para cada número:
- Imprima o valor
- Use os Predicates para classificar o número
 */
import java.util.Scanner;
import java.util.function.Predicate;

public class DesafioPredicate {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[1];

        while (true) {
            IO.println("Digite um número inteiro");

            if(entrada.hasNextInt()){
                numeros[0] = entrada.nextInt();
                entrada.nextLine();
                break;
            }else{
                IO.println("Entrada inválida. Apenas inteiros.");
                entrada.nextLine();
            }
        }
/*______________________________________________________________________________________________________________________
        Uso do predicate e do lambda, lembrando que essa interface representa uma função com valor booleano dentro de um
        argumento, ou seja, pega um argumento e associa com verdadeiro ou falso.                                      */

        Predicate<Integer> par = n -> n % 2 == 0;//Argumento que 'n' % 2 se for '==' a 0, vai receber um boolean
        Predicate<Integer> cinquenta = n -> n > 50;//Argumento que se 'n' for '>' que 50, vai receber um boolean
        Predicate<Integer> positivo = n -> n >= 0;//Argumento que se 'n' for '>=' a 0, vai receber um boolean

        for(int valor : numeros){ //ForEach para percorrer o array e fazer os tester 'ifs'

            if(par.test(valor)){  //Uso da função '.test' que vem junto com o 'predicate' para testar os 'lambdas'
                IO.println("O número é par");
            }else{
                IO.println("O número é ímpar");
            }
            if(cinquenta.test(valor)){
                IO.println("O número é maior que cinquenta");
            }else{
                IO.println("O número é menor que cinquenta");
            }
            if(positivo.test(valor)){
                IO.println("O número é positivo");
            }else{
                IO.println("O número é negativo");
            }
        }
    }
}
