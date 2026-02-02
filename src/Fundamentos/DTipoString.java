package Fundamentos;

import java.time.LocalDate;

public class DTipoString {
    static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        String nome = "Lucas";
        String sobrenome = "Santos";
        int idade = 24;
        LocalDate nascimento = LocalDate.of(2000, 12, 31);
        String profissao = "biomédico";
        Double altura = 170.51;

    System.out.println("\nInformações:" +  "\n\nData " + hoje);
    System.out.printf("\nNome: %s %s, \nIdade: %d  anos", nome, sobrenome, idade);
    System.out.println("\nData de Nascimento: " + nascimento);
    System.out.printf("\nProfissão: %s \nAltura: %.2f cm", profissao, altura);

// %s = "string", %d = "int", %f = "flutuantes" (double)


        nome = nome.replace("Lucas", "Lucy"); //"String's são imutáveis, por isso o "Replace"
        System.out.println("\nNome: " + nome + " Santos");
        System.out.println("\n" + nome);
    }
}
