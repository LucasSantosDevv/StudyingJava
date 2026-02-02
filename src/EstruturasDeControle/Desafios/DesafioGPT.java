package EstruturasDeControle.Desafios;

/*Criar um programa que permita cadastrar vários alunos, registrar suas notas e calcular médias individuais usando
algumas estruturas de controle (if/else, for, while, break, continue, etc.) */

import java.util.Scanner;

public class DesafioGPT {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while(true){        //primeiro loop para inserir o nome do aluno
            System.out.println("Insira o nome do aluno (ou 'sair' para finalizar)");
            String nome = entrada.nextLine().toLowerCase();
            if(nome.equals("sair")){        //nome = 'sair', fim do primeiro loop
                break;
            }

            double total = 0;       //variável do somatório das nota do aluno
            int quantidadeNotas = 0;        //variável da quantidade de notas que ele tem

            while(true){        //segundo loop para inserir a(as) notas do aluno
                System.out.println("insira nota de " + nome + "(ou digite '.' para finalizar)");
                String NOTA = entrada.nextLine().replace(",",".");

                if(NOTA.equals(".")) {      //NOTA = '.', fim do segundo loop
                    break;
                }

                double nota = Double.parseDouble(NOTA);     //NOTA em 'string' convertido para nota em 'Double'

                if (nota >= 0 && nota <= 10){       //range de notas válidas
                    total += nota;      //soma das notas com a variável 'total'
                    quantidadeNotas++;      // soma da quantidade de notas que o aluno teve
                }else{
                    System.out.println("Insira uma nota válida");
                }
            }

            if(quantidadeNotas > 0){        //prevenção da divisão por zero
                double média = total / quantidadeNotas;     //cálculo da média
                System.out.printf("a média do %s foi: %.2f\n\n", nome, média);
            }
        }

        entrada.close();
    }
}
