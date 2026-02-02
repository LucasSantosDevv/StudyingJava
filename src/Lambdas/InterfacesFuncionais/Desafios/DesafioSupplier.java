package Lambdas.InterfacesFuncionais.Desafios;

/*
1. Criar um Supplier<Integer> que:
    - Gere um número inteiro aleatório entre 1 e 100
2. Criar um Supplier<String> que:
    - Gere uma mensagem baseada no número gerado "Alto" se o número for ≥ 50 "Baixo" caso contrário
3. Executar o Supplier<Integer> uma vez
4. Usar o valor gerado para decidir a mensagem
5. Imprimir no console:
 */

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class DesafioSupplier {
    static void main(String[] args) {

        //Supplier que gera um número aleatório
        Supplier<Integer> ram = () -> new Random().nextInt(100);
        //Executando a função de gerar um número aleatório
        int n = ram.get();

        //Supplier que pega (via lambda) o número aleatório e o compara com 50
        Supplier<String> a = () -> n >= 50 ? "Alto" : "Baixo";

        //Impressão do resultado
        IO.println("Número: " + n + " -> " + a.get());
    }
}
