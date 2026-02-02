package Fundamentos;

//Wrapper é uma forma de "converter" tipos primitivos em objetos
//1. byte (primitivo)    = Byte (Wrapper)
//2. short (primitivos)  = Short (Wrapper)
//3. int (primitivo)     = Integer (Wrapper)
//4. long (primitivo)    = Long (Wrapper)
//5. boolean (primitivo) = Boolean (Wrapper)
//6. char (primitivo)    = Character (Wrapper)
//7. float (primitivo)   = Float (Wrapper)
//8. double (primitivo)  = Double (Wrapper)
/*Isso serve para quando for necessário o uso de objetos para conversão em ‘Strings’ ou outras classes, ou até mesmo
quando precisamos que uma ‘String’ vire um valor numérico para soma, por exemplo.*/

//NOTA MENTAL: comando de número para ‘string’ = "elemento".toString
             //Comando de ‘String’ para número: "elemento".parse"elemento"

import javax.swing.JOptionPane;

public class FWrapper {
    static void main(String[] args) {

        int a = 24;
        System.out.println(a);

        Integer b = 24;
        System.out.println(b);

        //Até aqui parece que nada mudou, mas siga a baixo:

        String VinteQuatro = b.toString();
        System.out.println(VinteQuatro);

        //Aqui já convertemos um objeto em uma String o que nos permitira fazer:

        VinteQuatro = VinteQuatro.replace("24", "Vinte e Quatro");
        System.out.println(VinteQuatro);
        VinteQuatro = VinteQuatro.toUpperCase();
        System.out.println(VinteQuatro);
        VinteQuatro = VinteQuatro.concat(" CARALHOOOOOO");
        System.out.println(VinteQuatro);
        System.out.println(VinteQuatro.length());

        // Até aqui vimos a transformação de número para String, vamos alternar agora:

        String numero1 = JOptionPane.showInputDialog("Inira o valor um:");    //aqui criamos uma tela para o utilizador
        String numero2 = JOptionPane.showInputDialog("Inira o valor dois:"); //inserir uma 'string'

        double valor1 = Double.parseDouble(numero1);
        double valor2 = Double.parseDouble(numero2); //aqui os comandos para conversão para Double
        double soma = valor1 + valor2;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + soma / 2);

        //Aqui algumas funções que podemos fazer com os numerais ao ínves das 'strings'


    }
}
