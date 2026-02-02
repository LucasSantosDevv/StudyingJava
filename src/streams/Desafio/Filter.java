package streams.Desafio;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    static void main(String[] args) {

        FilterConstructor c1 = new FilterConstructor(123, 1234.56);
        FilterConstructor c2 = new FilterConstructor(456, 123.45);
        FilterConstructor c3 = new FilterConstructor(97, 12.34);
        FilterConstructor c4 = new FilterConstructor(103, 12345.67);
        FilterConstructor c5 = new FilterConstructor(9, 123456.78);     //Criação das contas

        List<FilterConstructor> banco = Arrays.asList(c1, c2, c3, c4, c5);      //Criação da lista com as contas

        Predicate<FilterConstructor> contasValiosas = a -> a.saldo >= 10000;        //Filtro com contas acima de um valor 'x'
        Predicate<FilterConstructor> contaAntiga = a -> a.numeroDaConta <= 100;     //Filtro com contas mais antigas
        Function<FilterConstructor, String> mensagem = a -> "Conta: " + a.numeroDaConta + " \n" + "Seu saldo é de: R$" + a.saldo;
        //Criação de uma função capaz de ler os atributos dos objetos

        banco.stream()
                .filter(contasValiosas)
                .filter(contaAntiga)
                .map(mensagem)      //Uso de um map para mapear a lista e os atributos dos objetos
                .forEach(System.out::println);

    }
}
