package Excecoes.Desafios;

import java.util.Scanner;

/* 1. criar uma classe conta para criar uma conta bancária nova;
   2. ter a possibilidade de acessar uma conta já existente;
   3. acessar a conta através de uma senha;
   4. ter operações básicas de uma conta bancária;

 */
public class CaixaEletronico {
    static void main(String[] args) {

        Banco c1 = new Banco(123, 6969, 1000);
        Scanner entrada = new Scanner(System.in);

        while (true) {                                          //Autenticador de conta
            IO.println("\nInforme o número da sua conta");
            try {
                c1.autenticarConta(entrada.nextInt());
                break;
            }catch (RuntimeException a){
                IO.println(a.getMessage());
                IO.println("por favor tente novamente");
            }
        }
        while (true) {                                          //Autenticador de senha
            IO.println("\nInforme a senha");
            try {
                c1.autenticarSenha(entrada.nextInt());
                break;
            }catch (RuntimeException a){
                IO.println(a.getMessage());
                IO.println("por favor tente novamente");
            }
        }
        while (true){
            
        IO.println("\nQual operação deseja realizar?\n1. Saldo     2. Saque     \n3. Depósito  4. Sair");
        int escolha = entrada.nextInt();

            if(escolha == 1){
                IO.println("R$" + c1.saldo());
            }
            if(escolha == 2){
                IO.println("Digite o valor desejado");
                c1.saque(entrada.nextInt());
                IO.println("Saque realizado com sucesso");
            }
            if(escolha == 3){
                IO.println("Digite o valor desejado");
                try {
                    c1.depositar(entrada.nextInt());
                    IO.println("Depósito realizado com sucesso");
                    break;
                } catch (Exception a) {
                    IO.println(a.getMessage());
                    IO.println("por favor tente novamente");
                }
            }
            if(escolha == 4){
                break;
            }
        }
    }
}
