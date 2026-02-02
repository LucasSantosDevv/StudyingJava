package Lambdas.InterfacesFuncionais.Desafios;

import java.util.Random;
import java.util.function.*;

public class DesafioPipeline {
    static void main(String[] args) {

        int max = 500;
        int min = -500;

        Supplier<Integer> random = () -> new Random().nextInt(min , max + 1);    //1. Entrada (gera algo que ainda não existe)
            int a = random.get();
//________________________________________________________________________________________________________________________________________________
        UnaryOperator<Integer> absolut = n -> Math.abs(n);  //2. Normalização (pega um tipo e transforma em algo no mesmo tipo)
            a = absolut.apply(a);
//________________________________________________________________________________________________________________________________________________
        Predicate<Integer> ePar = n -> n % 2 == 0;
        Predicate<Integer> maiorCem = n -> n >= 100;    //3. Classificação (boolean V ou F)
//________________________________________________________________________________________________________________________________________________
        Function<Integer, String> print = (n) -> n + ": ";  //4. Transformação (junta dois tipos Interger + String)
//________________________________________________________________________________________________________________________________________________
        Consumer<Integer> par = n -> IO.println(print.apply(n) + "é par");
        Consumer<Integer> impar = n -> IO.println(print.apply(n) + "é ímpar");
        Consumer<Integer> maior = n -> IO.println(print.apply(n) + "é maior que 100");
        Consumer<Integer> menor = n -> IO.println(print.apply(n) + "é menor que 100");  //5. Saída

        (ePar.test(a) ? par : impar).accept(a);
        (maiorCem.test(a) ? maior : menor).accept(a);
        /*Isso é programação funcional, deixo as funções decidirem por mim ao invés de usar o imperativo do 'if' e dizer o que elas devem fazer,
        isso gera um reaproveitamento muito maior de funções, apesar de ser estranho de ver e pensar em primeiro momento.

        Tradução da linha:
        1º: "(ePar.test(a)" -> chama o "Predicate" 'ePar' (com o uso do '.test')sob a variável 'a';
        2º: "? par : impar)" -> uso do op ternário sob o "Predicate" para chamar ou o "Consumer" 'par' (se for V) ou 'impar' (se for F);
        3º: ".accept(a)" -> chama o "Consumer" que for escolhido através do op ternário sobre a variável 'a'. */
    }
}
