package streams.Desafio;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce {
    static void main(String[] args) {

        ReduceConstructor a1 = new ReduceConstructor("Lucas", 5.1);
        ReduceConstructor a2 = new ReduceConstructor("Luana", 6.1);
        ReduceConstructor a3 = new ReduceConstructor("Lucio", 7.1);
        ReduceConstructor a4 = new ReduceConstructor("Luara", 8.1);
        ReduceConstructor a5 = new ReduceConstructor("Luca", 9.1);

        List<ReduceConstructor> alunos = List.of(a1, a2, a3, a4, a5);

        Predicate<ReduceConstructor> notas = n -> n.nota >= 7;  //Classifica cada aluno como nota > ou < que 7.0
        Function<ReduceConstructor, Double> notas2 = n -> n.nota;   //"Transforma" o objeto em Double
        BinaryOperator<Double> nota3 = (n, m) -> n + m;     //Soma os valores Double

        IO.println("A soma total das notal dos alunos aprovados é:");
        alunos.stream()
                .filter(notas)                          //Filtrando as notas >= a 7.0
                .map(notas2)                            //Cria uma 'stream<Double>' (stream que só aceita objetos Double, generics)
                .reduce(nota3)                          //Optional Double (sem identidade / valor de entrada)
                .ifPresent(System.out::println);        //Executa o println apenas se o resultado do reduce existir
/*Valor da soma é descartada, uma vez que não existe uma variável para guardar o valor, impossibilitando o reúso da função
__________________________________________________________________________________________________________________________________________*/
        Double mediaAprovados = alunos.stream()
                .filter(notas)                              //Filtrando as notas >= a 7.0
                .mapToDouble(a -> a.nota)  //Cria uma 'DoubleStream' (stream especializada que carrega tipos primitivos)
                .average()                                  //Função específica das 'DoubleStream', já calcula a média de valores
                .orElse(0.0);                         //Retorna 0.0 caso não existam valores na DoubleStream
        IO.println("A média das notas dos alunos aprovado é:\n" + mediaAprovados);
/*Valor da média é salvo, uma vez que existe uma variável para guardar o valor, possibilitando o reúso da função
__________________________________________________________________________________________________________________________________________*/
    }
}
