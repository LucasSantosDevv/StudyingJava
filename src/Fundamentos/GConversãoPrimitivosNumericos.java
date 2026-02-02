package Fundamentos;

/*A conversão de primitivos numéricos acontece normalmente dentro do Java, desde que ocorra de maneira de uma variável
de menor memória para uma maior (byte > short, por exemplo), e isso é chamado de conversão IMPLÍCITA. Porém, o caminho
reverso também é possível desde que usemos o método CAST.
 */

public class GConversãoPrimitivosNumericos {
    static void main(String[] args) {

        //byte < short < int <long (inteiros)
        //float < double (decimais)

        byte a = 100;
        short b = a;
        int c = b;
        long d = c;         //Aqui é possível ver como a conversão ocorre de maneira implícita (automática)

       System.out.println(d);

       double e = 101;      /*Outro caso de conversão implícita, uma vez que "101" é um número inteiro (poderia ser
                        byte, short, int ou long) e está expresso como decimal*/

        System.out.println(e);

        short f = 120;
        byte g = (byte) f;

        System.out.println(g); /*Já aqui é fiz uma conversão CAST "informando o Java que eu queria que o short "f" fosse
                            equivalente ao byte "g"*/

        double h = 1.0;
        int i = (int) h;

        System.out.println(i); /*Outra conversão CAST "informando o Java que eu queria que o double "h" fosse
                            equivalente ao int "i"*/

        double j = 1.89541263465454;
        float k = (float) j;

        System.out.println(k); /*Outra conversão do estilo CAST, porém onde há perda de informação parcial devido à
                              limitação do conversor*/
    }
}
