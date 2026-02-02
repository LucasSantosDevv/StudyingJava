package Lambdas;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

        static void meuMetodo(Integer registro, String nome){
            IO.println("Número de registro: " + registro + ", " + "Aluno: " + nome);
        }

    static void main(String[] args) {

        Map<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Lucas");
        alunos.put(2, "Guilherme");
        alunos.put(3, "Bruno");
        alunos.put(4, "Carlos");

        //Forma tradicional de se ler uma collection
        IO.println("Forma Tradicional");
        for(Map.Entry<Integer, String> nomesAlunos : alunos.entrySet()){
            IO.println(nomesAlunos);
        }

        //Forma lambda de se ler uma collection
        IO.println();
        IO.println("Forma Lambda");
        alunos.forEach((resgistro, nome) -> {IO.println(resgistro + ":" + nome);});
        /*O metodo acima é muito prático e personalizável, e basicamente consiste em chamar a collection + a função 'forEach' +
        a identificação (Interger resgistro, String nome) + o que fazer com tudo isso (-> {IO.println(resgistro + nome);});)*/

        //Forma lambda personalizada pelo programador usando o metodo próprio
        IO.println();
        IO.println("Forma Lambda personalizada");
        alunos.forEach((resgistro, nome) -> meuMetodo(resgistro, nome));
    }
}
