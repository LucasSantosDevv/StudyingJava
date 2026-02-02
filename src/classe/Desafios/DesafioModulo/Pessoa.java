package classe.Desafios.DesafioModulo;

/*Nesta classe deve ter o nome e o peso da pessoa, além de um metodo comer que fará com que o peso da comida seja
somado ao peso da pessoa                    */

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

     void comer (Comida gramas){
        peso += gramas.gramagem;
    }

}

    /*double comer(Comida gramas){
        return peso + gramas.gramagem
    }
     */