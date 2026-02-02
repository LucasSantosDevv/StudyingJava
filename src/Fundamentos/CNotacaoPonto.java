package Fundamentos;

public class CNotacaoPonto {

    /* a notação ponto é usada para atribuir funções específicas num código, e existem milhares delas,
    como por exemplo: */

    static void main(String[] args) {

        String a = "Bom dia x"; //  aqui nós armazenamos um valor da String "A"
        System.out.println(a); // aqui nós mandamos o sistema mostrar o valor abribuida para "A"

        //1ª FUNÇÃO: substituição

        a = a.replace("x", "senhor"); //aqui nós armazenamos a substituição
        System.out.println(a); //aqui nós mandamos o sistema mostrar o valor substituído de "A"

        //2ª FUNÇÃO: adição

        a = a.concat("!"); //aqui nós adicionamos ao final da frase um novo valor
        System.out.println(a); //aqui nós mandamos o sistema mostrar tudo

        //Existem outras infinitas funções para o ponto, mas também é possível fazer uma quebra de código com ele

    String b = "lucas é x".
            replace("x", "inteligente").
            toUpperCase().
            concat("!");
        System.out.println(b);
    }
}
