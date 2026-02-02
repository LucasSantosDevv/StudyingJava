package Lambdas.InterfaceCalculo;

/*As funções lambdas são um conjunto de funções que podemos implementar em poucas linhas de código fugindo do paradigma de OO, são úteis
para implementação de funções mais simples ou curtas, sem a necessidade da criação de metodos ou classes.
*/

import java.util.function.BinaryOperator;

public class Teste {
    static void main(String[] args) {

/*______________________________________________________________________________________________________________________
        Aqui vemos o uso do paradigma OO (com a necessidade das classes Interface e Implementação.)*/

        Calculo teste1 = new Implementacao();
        IO.println(teste1.executar(2, 3));

        teste1 = new Implementacao();
        IO.println(teste1.executar(4,5));

/*______________________________________________________________________________________________________________________
        A parti daqui veremos a implementação de lambda (Uso da classe Interface criada pelo coder, sem a classe implementação.)*/

        Calculo teste2 = (a, b) -> {
            return (a * b) / 2;                     //Função lambda associada a 'interface'.
        };
        IO.println(teste2.executar(6, 7));

        teste2 = (a, b) -> (a * b) / 2;     //Função lambda associada a 'interface' reduzida
        IO.println(teste2.executar(8, 9));

        IO.println(teste2.legal());     //Mostrando que métodos não abstratos não estragam interfaces.

/*______________________________________________________________________________________________________________________
        Implementação de função lambda do próprio Java (sem a necessidade das classes Interface e Implementação.)*/

        BinaryOperator<Double> teste3 = (a, b) -> (a * b) / 2;
        IO.println(teste3.apply(10.0, 11.0));
    }
}
