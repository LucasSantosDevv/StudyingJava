package classe;

/* Para aprender POO existem conceitos importantes que precisam ser aprendidos */

public class ConceitosObjetosVariaveis {


//  --------------- Primitivos ---------------


    int c = 3;

/* Tipos primitivos são armazenados na memória do computador de forma que, a variável 'c' foi salva com o valor 3,
e caso eu crie uma nova variável 'e'...
*/

    int e = c;

/*... o que temos aqui é uma cópia feita na memória do computador, ou seja, temos salvo uma variável 'c' com valor 3
e uma variável 'e' com valor de 'c'.
*/

    int a;      //uma variável numérica não iniciada tem valor = 0
    double b;   //uma variável flutuante não iniciada tem valor = 0
    boolean d;  //uma variável booleana não iniciada tem valor = false

//  --------------- Objetos/Instâncias ---------------


    int dia;
    int mes;
    int ano;

/*Uma variável sem 'static' ou fora de um bloco, é uma variável da instância/objeto, e isso significa que ela pode
ser acessada por um metodo ou construtor de qualquer lugar do código (sem a necessidade de estar antes)
 */

    ConceitosObjetosVariaveis(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano= ano;

/*Uma variável local (dentro de um bloco) só pode ser alcançada dentro do próprio bloco, estando inacessível fora dele
antes ou depois no código
 */
    }


    String dataFormatada(){
        String formatacao = "%d/%d/%d";
        return String.format(formatacao, this.dia, this.mes, this.ano);
    }

    static void main(String[] args) {

/* Já os objetos criados são salvos de maneira a endereçar de forma hexadecimal um local na mémoria onde foi salvo,
de forma que, como no caso a baixo, que há dois objetos de mesmo valor, não seja necessário criar uma cópia e poupar
espaço...
 */

        ConceitosObjetosVariaveis natal = new ConceitosObjetosVariaveis(25, 12, 2025);
        ConceitosObjetosVariaveis diaMaisFelizAno = natal;

/*... no objeto 'natal' foi alocado um espaço na memória com o dia, mes e ano, e nós podemos acessar tal memória
através do endereço hexadecimal, já no objeto 'diaMaisFelizAno', o que mos é um mesmo endereço atribuído a este
objeto que leva aquele espaço de mémoria
 */

        diaMaisFelizAno.dia = 31;

/* Quando mudamos os atributos do objeto, é criado um novo espaço de mémoria para salvar os novos atributos e um novo
endereço para referenciá-lo, e caso não haja mais nada endereçado a memória inicial, ela torna-se inacessível e acaba
sendo excluída pelo Java
 */

        System.out.println(natal.dataFormatada());
        System.out.println(diaMaisFelizAno.dataFormatada());
    }
}
