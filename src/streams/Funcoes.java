package streams;

//Criação de funções para reaproveitamento com o uso de interfaces funcionais

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Funcoes {

    private Funcoes(){

    }

    public static Consumer<String> print = System.out::print;                        //Uso de uma interface funcional
    public static UnaryOperator<String> maiuscula = n -> n.toUpperCase();     //Uso de uma interface funcional
    public static UnaryOperator<String> primeira = n -> n.charAt(0) + "";     //Uso de uma interface funcional
}
