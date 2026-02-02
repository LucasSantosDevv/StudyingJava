package streams;

import streams.Desafio.ReduceConstructor;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class streamDiversos {
    static void main(String[] args) {

        ReduceConstructor a1 = new ReduceConstructor("Lucas", 5.1);
        ReduceConstructor a2 = new ReduceConstructor("Luana", 6.1);
        ReduceConstructor a3 = new ReduceConstructor("Lucio", 7.1);
        ReduceConstructor a4 = new ReduceConstructor("Luara", 8.1);
        ReduceConstructor a5 = new ReduceConstructor("Luca", 9.1);

        List<ReduceConstructor> alunos = List.of(a1, a2, a3, a4, a5);

//________________________________________allMatch / anyMatch / noneMatch_______________________________________________
        Predicate<ReduceConstructor> aprovados = n -> n.nota >= 7;
        IO.println("allMatch / anyMatch / noneMatch...");
        IO.println(alunos.stream().allMatch(aprovados)); //verifica se todos dão 'match'
        IO.println(alunos.stream().anyMatch(aprovados)); //verifica se algum da 'match'
        IO.println(alunos.stream().noneMatch(aprovados)); //verifica se nenhuma da 'match'

//_________________________________________________min / max____________________________________________________________
        Comparator<ReduceConstructor> maiorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;                                       //função para criar uma comparação
        };
        IO.println("\nmin e max...");
        IO.println(alunos.stream().max(maiorNota).get()); //verifica a maior nota
        IO.println(alunos.stream().min(maiorNota).get()); //verifica a menor nota

//_________________________________________________Distinct_____________________________________________________________
        ReduceConstructor a6 = new ReduceConstructor("Lucas", 5.1);
        ReduceConstructor a7 = new ReduceConstructor("Luana", 6.1);
        ReduceConstructor a8 = new ReduceConstructor("Lucio", 7.1);
        ReduceConstructor a9 = new ReduceConstructor("Luara", 8.1);
        ReduceConstructor a10 = new ReduceConstructor("Luca", 9.1);
        List<ReduceConstructor> alunos2 = List.of(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10); //nova lista com duplicados para exemplo

        IO.println("\nDistinct...");
        alunos2.stream().distinct().forEach(System.out::println); //com uso do 'equals' e do 'hashcode' consegue eliminar duplicados

//______________________________________________Skip / Limit____________________________________________________________
        IO.println("\nSlip / Limit...");
        alunos2.stream()
                .distinct()
                .skip(1)        //pula um número determinado de elementos
                .limit(2) //limita a um número determinado de elementos
                .forEach(System.out::println);

//_________________________________________________takeWhile____________________________________________________________
        IO.println("\ntakeWhile...");
        alunos2.stream()
                .distinct()
                .skip(2)
                .takeWhile(aprovados)
                .forEach(System.out::println);
    }
}
