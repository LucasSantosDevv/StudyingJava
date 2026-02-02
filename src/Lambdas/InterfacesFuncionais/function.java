package Lambdas.InterfacesFuncionais;

/*As 'interfaces' funcionais de Java são 'interfaces' já atribuídas com suas respectivas funções dentro da própria linguagem, sem a necessidade
da criação pelo programador dentro de uma classe abstrata;

FUNCTION: representa uma função que recebe um argumento e devolve um resultado

INTERFACE	ENTRADA	 SAÍDA	 RETORNO	 METODO
Predicate:	1	     0	     boolean     test
Consumer:	1	     0	     void        accept
Function:	1	     1	     T-R         apply
UnaryOP:    1        1       T-T         apply
BinaryOP:   2        1       T-T-T       apply
Supplier:   0        1       any         get
 */

import java.util.function.Function;

public class function {
    static void main(String[] args) {

        //Aqui vemos como a função é capaz de receber um valor e devolvê-lo dentro de um mesmo tipo
        Function<Integer, Integer> multiplicar = n -> n * 2;  //Estrutura base de uma function
        int resultado = multiplicar.apply(10);  //Comando 'apply' para executar a função
        IO.println(resultado);

        //Aqui vemos a principal função da 'function', a mudança de tipo, onde ela transforma um tipo em outro
        Function<Integer, String> classificar = n -> n % 2 == 0 ? "Par" : "Ímpar";
        String result = classificar.apply(14);
        IO.println(result);

        /*A função 'apply' é a principal função executora da interface function, porém também há outro muito importante... O andThen serve para
        "amarrar" 'functions' umas nas outras, basicamente ele pega a saída de uma 'function' e amarra a entrada de outra, como vemos a seguir: */
        Function<Integer, String> posOuNeg = n -> n >= 0 ? "Positivo" : "Negativo";
        Function<String, String> oResultadoE = valor -> "O número é: " + valor;
        String res = posOuNeg.andThen(oResultadoE).apply(-10);
        IO.println(res);
        /*O que vimos aqui foi a função 'andThen' pegar a saída de 'posOuNeg' que nesse caso foi "Negativo" (note que é uma saída do tipo String),
        e dar como entrada em 'oResultadoE' (que obrigatoriamente precisa ter como parâmetro de entrada uma String) para que a saída seja uma nova
        String concatenada a 'function' primária.

        Function  | Primária            | Secundária
        Entrada   | Interger(-10)       | String("Negativo")
        Saída     | String("Negativo")  | String("O número é: " + valor;)
        */
    }
}
