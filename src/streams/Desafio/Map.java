package streams.Desafio;
/*
1. Transformar em binário (transformando o inteiro em String);
2. Inverter a ordem da String;
3. Converter de volta para inteiro.
*/
import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map {
    static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> binario = Integer::toBinaryString;
        //Function<Integer, String> binario = s -> Integer.toBinaryString(s);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> inteiro = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(binario)
                .map(inverter)
                .map(inteiro)
                .forEach(System.out::println);
    }
}
