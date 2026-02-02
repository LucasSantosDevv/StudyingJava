package streams;

/*  Retomando um raciocínio, uma stream de dados é uma sequência de informação ou dados alocado numa memória, o Stream
filter tem a função de filtrar uma Stream e gerar uma nova (sem alterar a original) da forma que for orientada a fazer:
                Stream
    | 3 | 5 | 8 | 12 | 1 | 19 | 4 | 0 |     (Stream original)
           Map (e -> e % 2 == 0)
            | 8 | 12 | 4 | 0 |              (Nova Stream)
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class streamFilter {
    static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);

        Predicate<Integer> par = p -> p % 2 == 0;
        Predicate<Integer> cinco = p -> p % 5 == 0;

        nums.stream()
                .filter(par)
                .filter(cinco)
                .forEach(System.out::println);
    }
}
