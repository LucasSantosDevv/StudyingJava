package Lambdas.InterfacesFuncionais.Desafios;

import java.util.function.Function;

/*
1. Criar uma Function<Integer, Integer> que:
 - Receba um número;
 - Retorne o valor absoluto (ex.: -7 → 7);

2. Criar uma Function<Integer, String> que:
 - Receba um número
 - Retorne:
    a) "Alto" se for ≥ 50
    b) "Baixo" caso contrário

3.Encadear as duas usando andThen

4. Testar com:
    a) -10
    b)20
    c)80
 */
public class DesafioFunction {
    static void main(String[] args) {

        Function<Integer, Integer> absolut = n -> Math.abs(n);
        Function<Integer, String> classes = n -> n >= 50 ? "Alto: " + n : "Baixo: " + n;

        String res = absolut.andThen(classes).apply(-10);
        String res2 = absolut.andThen(classes).apply(20);
        String res3 = absolut.andThen(classes).apply(80);
        IO.println(res);
        IO.println(res2);
        IO.println(res3);

    }
}
