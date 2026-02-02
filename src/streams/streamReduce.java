package streams;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/*  Retomando um raciocínio, uma stream de dados é uma sequência de informação ou dados alocado numa memória, o Stream
reduce tem a função de "fundir" muitos elementos em um só, podendo ser usado para:
    1. Fazer soma de números ou valores;
    2. Combinar objetos;
    3. Concatenar Strings.
    Dentre muitas outras coisas. Importante lembrar que o reduce é uma operação terminal, ou seja, mão é possível encadear
nada depois de seu uso, já que ela finaliza a stream;
    O "esqueleto" da função reduce consiste em associar uma collection com uma função, sendo esta última composta por um
acumulador e uma identidade, sendo a identidade o valor inicial e o acumular a função que fará a função desejada;

                             List<Integer> nums = List.of(1, 2, 3);     //lista de exemplo
                             nums.stream()                             //abertura da stream
                                 .reduce(0, (a, b) -> a + b);         //função designada a reduce
                            (0 = identidade / (a, b) -> a + b = acumulador)

    O reduce funciona como se fosse um loop for, ele vai passar por toda a collection realizando a função que foi designado
a fazer, como o de soma, por exemplo:
                                            | 1 | 2 | 3 |
                                               REDUCE -> (Acumulador, identidade)
                                         ---------------->  (0, 1) -> 0 + 1 = 1
                                                            (1, 2) -> 1 + 2 = 3
                                                            (3, 3) -> 3 + 3 = 6
*/
public class streamReduce {
    static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Metodo sem usar uma função dedicada (Binary Operator)
        int soma = nums.stream()
                .reduce(0, (a, b) -> a + b);
        IO.println(soma);

        //Metodo usando um Binary Operator para posteriormente ter reúsos.
        BinaryOperator<Integer> teste = (c, d) -> c + d;
        int soma2 = nums.stream()
                .reduce(10, teste);
        IO.println(soma2);

        //Uso do 'filter' para serem somados apenas os números pares
        int soma3 = nums.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, teste);
        IO.println(soma3);

        int binary = nums.stream()
                .reduce(0, teste);
        Function<Integer, String> teste2 = n -> Integer.toBinaryString(n);
        IO.println(teste2.apply(binary));

    }
}