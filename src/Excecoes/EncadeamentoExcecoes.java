package Excecoes;

import Excecoes.Desafios.Banco;

public class EncadeamentoExcecoes {

    static void metodoA(Banco conta){
       try {
           metodoB(conta);  //Chama o valor de "conta"
       } catch (Exception causa) {
           throw new IllegalArgumentException(causa);   //Em caso de conta inválida, lança "IllegalArgumentException"
       }
    }

    static void metodoB(Banco conta){   //lançará um "NullPointerException" + a mensagem caso não haja conta
        if(conta == null){
            throw new NullPointerException("Credenciais inválidas");
        }
        IO.println("Bem vindo a sua conta"+ conta.numeroConta); //ou esta mensagem + o número da conta acessada
    }

    static void main(String[] args) {

        try {
            metodoA(null);
        } catch (IllegalArgumentException a) {  //Chama o erro do metodoA
            IO.println(a.getCause().getMessage());  //Chama a causa do erro do metodoA, = metodoB (exceção original)
        }                                           //e posteriormente a mensagem desejada
    }
}
