package Lambdas.InterfacesFuncionais.Desafios;

//1. Calcular o preço real do produto (com desconto);
//2. Calcular o imposto municipal: >= R$2500 = a 8,5%  || < R$2500 (isento);
//3. Calcular o frete: >= 3000 = R$100 || < R$3000 = R$50;
//4. Dar o valor com apenas duas casas decimais;
//5. Formatar o valor em "R$1234,56".

import Lambdas.InterfacesFuncionais.Produto;
import java.util.function.*;

public class DesafioCapitulo {
    static void main(String[] args) {

        Produto p1 = new Produto("Samsung S23", 2499.99, 0.1);
        Produto p2 = new Produto("Samsung S25", 3999.99, 0.15);

        UnaryOperator<Double> aplicarImposto = preco -> preco * 1.085; //Calcula o valor do imposto a quem deve pagar
        Predicate<Produto> pagaImposto = prod -> prod.getPreco() >= 2500; //Verifica quem deve pagar imposto
        if(pagaImposto.test(p1)){   //Chama o 'Predicate' para classificar se deve pagar imposto
            p1.setPreco(aplicarImposto.apply(p1.getPreco()));   //Chama a função 'set' e passa o argumento da 'function' para calcular o novo preço
        }
        if(pagaImposto.test(p2)){   //Chama o 'Predicate' para classificar se deve pagar imposto
            p2.setPreco(aplicarImposto.apply(p2.getPreco()));   //Chama a função 'set' e passa o argumento da 'function' para calcular o novo preço
        }
//___________________________________________________________________________________________________________________________________________________
        p1.setPreco(p1.getPreco() * (1- p1.getDesconto()));
        p2.setPreco(p2.getPreco() * (1- p2.getDesconto())); //Pega o preço acrescido de imposto e calcula o desconto
//___________________________________________________________________________________________________________________________________________________
        Function<Produto, Double> frete = p -> p.getPreco() >= 3000 ? 100.0 : 50.0; //Soma o valor do frete as diferentes faixas de preço
        double preco1ComFrete = p1.getPreco() + frete.apply(p1);
        double preco2ComFrete = p2.getPreco() + frete.apply(p2);
//___________________________________________________________________________________________________________________________________________________
        Consumer<Produto> imprimir = p -> System.out.print(p.getNome() + ": "); //Imprimi o nome do produto
        imprimir.accept(p1);
        System.out.printf("R$%.2f", preco1ComFrete);
        IO.println();
        imprimir.accept(p2);
        System.out.printf("R$%.2f", preco2ComFrete);

    }
}
