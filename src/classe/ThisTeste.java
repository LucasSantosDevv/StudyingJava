package classe;

public class ThisTeste {
    static void main(String[] args) {

        This c1 = new This("Celta", 123, 125);
        This c2 = new This("Gol", 456, 130);
        This c3 = new This("Uno", 789, 140);
        This c4 = new This("Corsa",321, 135);
        This c5 = new This("Palio", 654, 120);
        This c6 = new This("Fox", 987, 150);

        System.out.printf(c1.carro + "  placa:" + c1.placa + "  velocidade máxima:" + c1.vMax + "Km/h\n\n"
                + c2.carro + "  placa:" + c2.placa + "  velocidade máxima:" + c2.vMax + "Km/h\n\n"
                + c3.carro + "  placa:" + c3.placa + "  velocidade máxima:" + c3.vMax + "Km/h\n\n"
                + c4.carro + "  placa:" + c4.placa + "  velocidade máxima:" + c4.vMax + "Km/h\n\n"
                + c5.carro + "  placa:" + c5.placa + "  velocidade máxima:" + c5.vMax + "Km/h\n\n"
                + c6.carro + "  placa:" + c6.placa + "  velocidade máxima:" + c6.vMax + "Km/h");
    }
}
