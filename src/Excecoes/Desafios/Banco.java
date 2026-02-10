package Excecoes.Desafios;

public class Banco {

    public int numeroConta; //publico apenas para teste em outra classe
    private int senha;
    private double saldo;

    public Banco(int numeroConta, int senha, double saldo) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = saldo;
    }

    public boolean autenticarConta (int numeroConta) {
        if(this.numeroConta != numeroConta){
            throw new RuntimeException("Número de conta desconhecido");
        }
    return true;
    }
    public boolean autenticarSenha (int senha){
        if(this.senha != senha){
            throw new RuntimeException("Senha incorreta");
        }
        return true;
    }
    public double saldo (){
        return saldo;
    }
    public void depositar(double deposito){
        if(deposito <= 0){
            throw new RuntimeException("Por favor insira um valor válido");
        }
        this.saldo += deposito;
    }
    public void saque(double saque){
        this.saldo -= saque;
    }
}
