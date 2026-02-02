package Fundamentos;

public class ACirculoVariável {

    static void main(String[] args) { //sempre iniciar com "maina"
      double raio = 5.6F; //Variável do círculo
      final double pi = 3.1415; //Constante da matemática

      double Circunfgerência = 2 * pi * raio; //Constante da matemática
      double Área = raio * raio * pi; //Constante da matemática
      double Diâmetro = 2 * raio; //Constante da matemática

      System.out.println("Circunfgerência = " + Circunfgerência + "cm2"); //Código para "jogar" a informação na tela
      System.out.println("Área = " + Área + "cm2");
      System.out.println("Diâmetro = " + Diâmetro + "cm2");

      raio = 14.723;
      Área = raio * raio * pi;
      System.out.println("Área = " + Área + "cm2");

      raio = 10.5;
      Diâmetro = 2 * raio;
      System.out.println("Diâmetro = " + Diâmetro + "cm2");
    }
}
