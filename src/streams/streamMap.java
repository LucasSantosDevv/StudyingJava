package streams;

/*  Retomando um raciocínio, uma stream de dados é uma sequência de informação ou dados alocado numa memória, o Stream
map tem a função de mapear uma Stream e gerar uma nova (sem alterar a original) da forma que for orientada a fazer:
                Stream
    | 3 | 5 | 8 | 12 | 1 | 19 | 4 | 0 |     (Stream original)
                 Map (e -> e * 2)
    | 6 | 10 | 16 | 24 | 2 | 38 | 8 | 0 |   (Nova Stream)
*/

import java.util.List;
import java.util.Arrays;

public class streamMap {
    static void main(String[] args) {

        List<String> marcas = Arrays.asList("Bentley ", "Mercedes ", "Williams ");     //Uso de uma collection para teste

        IO.println("Deseja ter o luxo da Bentley? A tecnologia da Mercedes?\nA história da Willians? Va de ");

        marcas.stream()              //Chamando a Stream
               .map(Funcoes.maiuscula)      //Operador intermediário
               .map(Funcoes.primeira)       //Operador intermediário
               .forEach(Funcoes.print);     //Operador terminal
    }
}

