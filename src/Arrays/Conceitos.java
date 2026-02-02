package Arrays;

/*Array's são um conjunto de elementos que obrigatoriamente precisam ser do mesmo tipo (float, double, int, String...) e que podem ser acessado por
um índice começando em 0:

        VALORES ⇒ [10] [22] [5] [13] [107]
        ÍNDICE ⇒   0    1    2   3     4

    É um metodo muito eficaz para guardar valores de forma organizada e sua limitação se dá pela necessidade de informar o tamanho do array no
momento da sua inicialização, não sendo possível / recomendado ampliar seu tamanho posteriormente.

    Um array é declarado e iniciado com o uso dos '[]', podendo ser feito em momentos diferentes (como visto a baixo) ou declarado e já iniciado
de uma vez no código:

         String [] diasSemana = new String [7];
         tipo + nome + operador + tipo + tamanho do array

    Também é possível iniciar um array já inserindo os valores em seus respectivos lugares:

        int[] pares = new int[]{ 2, 4, 6, 8 };
 */
import java.util.Random;

public class Conceitos {
    static void main(String[] args) {

    String [] diasSemana;       //Declaração de um array (sem inicialização)
    diasSemana = new String [7];        //Inicialização do array (previamente declarado)

        diasSemana [0] = "segunda";
        diasSemana [1] = "terça";
        diasSemana [2] = "quarta";
        diasSemana [3] = "quinta";
        diasSemana [4] = "sexta";
        diasSemana [5] = "sábado";
        diasSemana [6] = "domingo";      //Inserção de dados / informações no array

        //VALORES ⇒ [segunda] [terça] [quarta] [quinta] [sexta] [sábado] [domingo]
        //ÍNDICE  ⇒     0       1        2        3        4       5         6

        IO.println(diasSemana[1]);      //Acessando um valor específico do Array
    IO.println("\nOs dias da semana são:");

        for(String dias : diasSemana ){     //Uso do 'for Each' para acessar todos os valores do Array
            IO.println(dias);
        }
            IO.println("\nOs números pares do array são:");

/*  Haverá cenários onde não saberemos o que tem dentro de um array, ou que haverá incontáveis coisas e são precisaremos acessar aquelas com
alguma característica em particular, e podemos fazer isso de algumas formas:
*/
       Random numeros = new Random();   //Criação de uma sequência aleatória para o teste
       int[] testeNumeros = new int[20];    //Criação de um novo Array para o teste
       for(int num = 0; num < testeNumeros.length; num++){
           testeNumeros[num] = numeros.nextInt(100);    //Povoando o array com a sequência aleatória
       }

       for(int pares : testeNumeros){       //Criação do 'forEach' para percorrer o array
           if(pares % 2 == 0){          //Uso do 'if' e do módulo para identificação dos números pares do array
               IO.println(pares);
           }
       }

       String [] funcionarios = new String[10];     //Criação de um novo Array para o teste
       funcionarios[0] = "Lucas";
       funcionarios[1] = "Bruno";
       funcionarios[2] = "Carlos";
       funcionarios[3] = "Marcio";
       funcionarios[4] = "Robson";
       funcionarios[5] = "Alberto";
       funcionarios[6] = "Ederson";
       funcionarios[7] = "Irno";
       funcionarios[8] = "Osvaldo";
       funcionarios[9] = "Udson";

       IO.println("\nOs nomes dos funcionários que começam com vogais são:");
       for(String nomes : funcionarios){        //Uso do 'forEach' para percorrer o Array e identificar as vogais
           if(nomes.startsWith("a") || nomes.startsWith("A") || nomes.startsWith("e") || nomes.startsWith("E") ||
           nomes.startsWith("i") || nomes.startsWith("I") || nomes.startsWith("o") || nomes.startsWith("O") ||
           nomes.startsWith("u") || nomes.startsWith("U")){
               IO.println(nomes);
           }
       }

//  Também podemos manipular os dados dentro dos arrays de diferentes formas

       double soma = 0;
       double media;
       int maior = 0;
       int menor = 100;
       IO.println();
       for(int num : testeNumeros){       //Uso do 'forEach' para somar o valores do array
           if(num > maior){     //Uso do 'forEach' e do 'if' para comparar e descobrir o maior número do array
               maior = num;
           }
           if(num < menor){     //Uso do 'forEach' e do 'if' para comparar e descobrir o menor número do array
               menor = num;
           }
           soma += num;
       }
       media = soma / testeNumeros.length;      //Uso da soma feita pelo 'forEach' para calcular a média
       IO.println("A soma do array é: " + soma);
       IO.println("A média do array é: " + media);
       IO.println("O maior número do array é: " + maior);
       IO.println("O menor número do array é: " + menor);
    }
}
