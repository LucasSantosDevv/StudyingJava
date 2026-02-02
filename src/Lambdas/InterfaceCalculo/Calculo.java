package Lambdas.InterfaceCalculo;

//Criação de uma 'interface' para gerar um metodo com duas variáveis double (a e b).

@FunctionalInterface        //interfaces funcionais podem ter apenas uma função abstrata
public interface Calculo {

    double executar(double a, double b);    //função abstrata

    default String legal(){     //função não abstrata
        return "LEGAL";
    }
}
