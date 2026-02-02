package Arrays;

/* É possível a criação de matrizes utilizando uma array dentro da outra, o que faz que uma estrutura unidimensional
passe a ser bidimensional, onde cada linha ou coluna passa a ser associada a algum outro tipo de dado ou informação
 */

import java.util.Scanner;

public class matrizes {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeAlunos = 0;
        int quantidadeNotas = 0;        //--- Abertura das variáveis da matriz ---


        while (true) {      //--- Abertura do loop para inserção correta dos valores ---
        System.out.println("\n --- Insira a quantidade de alunos --- ");
        quantidadeAlunos = entrada.nextInt();

        System.out.println("\n --- Insira a quantidade de notas --- ");
        quantidadeNotas = entrada.nextInt();

            if (quantidadeAlunos > 0 && quantidadeNotas > 0) {
                break;
            }else{
                System.out.println("Por favor insira um número válido (Quantidade de notas e aluno > 0)");
            }
        }

        //--- Abertura da matriz, com os alunos no eixo horizontal e as notas no eixo vertical ---

        double [] [] notasTurma = new double[quantidadeAlunos][quantidadeNotas];

        double mediaAluno = 0;
        double mediaTurma = 0;
        double somaMedias = 0;      //--- abertura de variáveis para o cálculo das médias ---

        for(int a = 0; a < quantidadeAlunos; a++){      //--- controle da linha a ser lida ---
            System.out.println("\nAluno " + (a + 1));
            double soma = 0;

            for(int b = 0; b < quantidadeNotas; b++){       //--- controle da coluna a ser lida ---
                System.out.print("Nota " + (b + 1) + ": ");
                notasTurma [a][b] = entrada.nextDouble();       //--- entrada dos valores das dimensões da matriz ---
                soma += notasTurma[a][b];       //--- soma das notas do aluno ---
            }
            mediaAluno = soma / quantidadeNotas;        //--- cálculo da média de cada aluno ---
            System.out.println("Média: " + mediaAluno);

            somaMedias += mediaAluno;
        }

        mediaTurma = somaMedias / quantidadeAlunos;     //--- cálculo da média da turma ---
        System.out.println("\n\n a média da turma foi de: " + mediaTurma);
    }
}
