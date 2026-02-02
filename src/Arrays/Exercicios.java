package Arrays;

/*  Arrays's são estruturas inicialmente unidimensionais que armazenam diferentes tipos de valor, como tipos primitivos
e objetos, também podem adquirir mais dimensões através da criação de array's dentro de array's. Suas principais
características consistem em:

1. Serem estáticos: ou seja, após sua criação não é possível alterar o tamanho;
2. Serem homogêneos: ou seja, após sua tipificação, não é possível salvar outro tipo de valor dentro dele;
3. São objetos: ou seja, possuem características e métodos associados;

    Para sua criação é necessário: 'tipo da variável' + '[]' + 'nome do array' + '=' + 'new' + 'tipo da variável' +
'[tamanho do array]'
 */

import java.util.Scanner;

public class Exercicios {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[3];     //Array iniciado

        System.out.println("Por favor insira a 1ª nota");
        String NOTA1 = entrada.nextLine().replace(",",".");
        double nota1 = Double.parseDouble(NOTA1);
        notas[0] = nota1;       //Inserção da nota do usuário para dentro do array

        System.out.println("Por favor insira a 2ª nota");
        String NOTA2 = entrada.nextLine().replace(",",".");
        double nota2 = Double.parseDouble(NOTA2);
        notas[1] = nota2;       //Inserção da nota do usuário para dentro do array

        System.out.println("Por favor insira a 3ª nota");
        String NOTA3 = entrada.nextLine().replace(",",".");
        double nota3 = Double.parseDouble(NOTA3);
        notas[2] = nota3;       //Inserção da nota do usuário para dentro do array

        double soma = 0;

        for(int a = 0; a < notas.length; a++){  //'.length' é usado para equiparar quantidades
            soma += notas[a];                   /*O 'for' é muito usado para operações com os array's, devido a ser
                                            um loop, é possível criar uma condição que percorra toda a array e
                                            execute alguma função*/
        }
        double media = soma / notas.length;
        System.out.println("A média do aluno foi de: " + media);

        for(double nota: notas){
            System.out.println(nota);           //Também é possível usar a estrutura de controle 'foreach'
        }

        entrada.close();
    }
}
