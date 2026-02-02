package Fundamentos;

import java.time.LocalDate; //Import de uma função de fora do JAVA LANG
import java.time.LocalDateTime; //Import de uma função de fora do JAVA LANG

public class BInferênciasImport {

    /* dentro das variáveis, é possível usar o recurso "VAR", uma vez que a linguagem JAVA é capaz de entender a partir
    do valor que foi atribuido a qual variável pertence.
     */

    static void main(String[] args) {

       final var idade = 24;
       final var genero = "Masculino";
       String nome = "Lucas";
       String sobrenome = "Santos";
       LocalDate Nascimento = LocalDate.of(2000, 12, 31); //Uso do import
       LocalDateTime agora = LocalDateTime.now(); //Uso do import

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Gênero: " + genero);
        System.out.println("Data de Nascimento: " + Nascimento);
        System.out.println("Data " + agora + "\n\n");

        System.out.printf("Nome %s %s", nome, sobrenome);
    }
}
