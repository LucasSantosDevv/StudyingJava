package EstruturasDeControle;

//'For' é uma estrutura usada para criação de laços de repetição do código (repetição com numeração determinada).

public class For {
    static void main(String[] args) {

     //definição da variável; declaração  v/f; manipulação da variável
        for(int contador = 0; contador <= 100; contador += 5){
            System.out.printf("x = %d\n", contador);
        }

        for(int contador2 = 10; contador2 >= 0; contador2 -=2){
            System.out.printf("\ny = %d\n", contador2);
        }

        for(int a = 0; a < 10; a++ ){
            for(int b = 0; b < 5; b++){
                System.out.printf("[%d %d]", a, b);
            }
        }
        System.out.println("\nFim");
    }
}
  /*Para utilizar o for, você OBRIGATORIAMENTE deve saber o número de tentativas ou repetições a realizar e também
lembrar que diferentemente do 'while' aqui você já coloca todos os parâmetros dentro dos ( ).

Por exemplo: for(int tentativas = 1; tentativas <= 10; tentativas++)

1.No primeiro segmento temos uma variável int de nome 'tentativas' que vale 1
2.No segundo segmento temos por quantos ciclos o loop vai ocorrer (enquanto a 'int' for menor ou igual a 10)
3.No terceiro segmento temos a manipulação da variável (operador unário de +1)                                  */