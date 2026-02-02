package Excecoes;

import classe.Objeto;

public class Conceitos {

    public static void imprimir(Objeto objeto){
        IO.println(objeto.nome);
    }

    static void main(String[] args) {
        Objeto a1 = new Objeto("Lápis");
        Objeto a2 = null;

        imprimir(a1);
      //imprimir(a2);

        try {
            imprimir(a2);
        }catch (Exception excecao){
            IO.println("houve um erro");
        }
    }
}
