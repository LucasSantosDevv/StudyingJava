package OO.Desafios.Heranca;

public class CarrosTeste {
    static void main(String[] args) {

        Civic c1 = new Civic("Honda Civic", 0, false, 190);
        Fit c2 = new Fit("Honda Fit",+ 0,false, 160);

        c1.ligar();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.ligarSport();

        c1.acelerar();

        IO.println(c1.velocidadeAtual + " Km/h");

        c2.ligar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        IO.println(c2.velocidadeAtual + " Km/h");
    }
}
