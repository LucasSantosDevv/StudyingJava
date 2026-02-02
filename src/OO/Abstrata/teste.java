package OO.Abstrata;

public class teste {
    static void main(String[] args) {

        Animal a1 = new Macaco();
        a1.setMamiferos("Macaco");
        a1.setEspecie("Chimpanzé");

        Animal a2 = new Lagarto();
        a2.setRepteis("Lagarto");
        a2.setEspecie("Teiú");

        Animal a3 = new Sapo();
        a3.setAnfibios("Sapo");
        a3.setEspecie("Cururu");

        a1.respirar();
        a2.respirar();
        a3.respirar();

        a1.locomocao();
        a2.locomocao();
        a3.locomocao();
    }
}
