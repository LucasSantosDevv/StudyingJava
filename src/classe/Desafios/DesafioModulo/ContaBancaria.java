package classe.Desafios.DesafioModulo;

public class ContaBancaria {

    String titular;
    double saldo;

    ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar (double deposito){
        if(deposito < 0){
            System.out.println("Por favor insira um número válido");
        }else {
            this.saldo += deposito;
        }
    }
    void sacar (double saque){
        if (saque > saldo){
            System.out.println("Você não tem saldo suficiente");
        }else{
            this.saldo -= saque;
        }
    }
    void info(){
        System.out.println("R$" + saldo);
    }
}
