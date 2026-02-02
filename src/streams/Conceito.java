package streams;

import java.util.List;

/*  Streams são conceitualmente uma linha de produção que permite percorrer e manipular um conjunto de dados já existente, como listas, arrays,
objetos dentre outros, se relacionam intimamente com funções lambda, uma vez que apenas manipulam os dados, mas sem serem estruturas de controle,
sem armazenar elementos e nem substituí-los. Os streams basicamente consistem em 3 tipos de operações e seguem 3 pilares de funcionamento:

1.º pilar: Lazy evaluation
    As operações escritas no código não são executadas imediatamente, apenas quando solicitadas;
2.º pilar: Imutabilidade lógica
    A stream não altera a coleção original, apenas manipula da forma desejada e muda a perspectiva de visão sobre ela;
3.º pilar: Op terminal
    Além de pilar, as op terminais também são uma dos três tipos de operação, e basicamente ela é a executora de tudo, sem ela nada acontece.

 */
public class Conceito {
    static void main(String[] args) {

        List<Integer> numeros = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);    //Lista para demonstração
//________________________________________________________________________________________________________________________________________________
        IO.println("________\nForma de ler uma 'collection' através do 'for' clássico");
        for(int a = 0; a < numeros.size(); a++){
            if(a % 2 == 0 && a > 5) {
                IO.println(numeros.get(a));     //Programação imperativa (uso de estruturas de controle para filtrar)
            };
        }
//________________________________________________________________________________________________________________________________________________
        IO.println("________\nForma de ler uma 'collection' através do 'foreach'");
        for(int a : numeros){
            if(a % 2 == 0 && a > 5) {
                IO.println(a);                 //Programação imperativa (uso de estruturas de controle para filtrar)
            };
        }
//________________________________________________________________________________________________________________________________________________
        IO.println("________\nForma de ler uma 'collection' através de 'stream'");
        numeros.stream()                                //Operação primária, criação do fluxo
                .filter(n -> n % 2 == 0)        //Operação intermediária, manipulação do fluxo
                .filter(n -> n > 5)            //Operação intermediária, manipulação do fluxo
                .forEach(System.out::println);       //Operação terminal, encerramento do fluxo (nada acontece até essa OP.)
    }
}

//  Importante lembrar que tudo que fizemos foi percorrer e manipular dados, não alteramos em nada a lista inicial

