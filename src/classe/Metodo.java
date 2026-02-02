package classe;

/*Também é possível fazer o uso de métodos para otimizar algumas funções, como por exemplo aqui, já que
estamos lidando com produtos e descontos, além das variáveis, podemos implementar os métodos dentro desta
classe                                                                                                  */

public class Metodo {

        String NOME;
        double PRECO;
        double DESCONTO;

//E como um metodo funciona: tipo de retorno + nome do metodo + parâmetros de entrada + algoritmo

        double precoComDesconto(){
            return PRECO * (1 - DESCONTO);
        }

/* Nota-se que temos um retorno do tipo 'double', um nome, nenhum parâmetro de entrada '()' (devido a termos
todos os valores já definidos em variáveis) e o algoritmo, que retorna preço com desconto   */
}
