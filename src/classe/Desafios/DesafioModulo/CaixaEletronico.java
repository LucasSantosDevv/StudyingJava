package classe.Desafios.DesafioModulo;

public class CaixaEletronico {
    static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria("Lucas", 4000);

        c1.info();

        c1.sacar(500);

        c1.info();

        c1.depositar(1250);

        c1.info();

        c1.depositar(-100);

        c1.sacar(5000);

    }
}
