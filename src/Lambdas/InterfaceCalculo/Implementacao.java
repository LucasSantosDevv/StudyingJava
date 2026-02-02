package Lambdas.InterfaceCalculo;

//Implementação da ‘interface’ para o cálculo de área de um triângulo (seguindo o paradigma da OO).

public class Implementacao implements Calculo {

    @Override
    public double executar(double a, double b) {
        return (a * b) / 2;
    }
}
