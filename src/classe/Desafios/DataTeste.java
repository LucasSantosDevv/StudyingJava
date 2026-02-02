package classe.Desafios;

public class DataTeste {
    static void main(String[] args) {

        Data um = new Data();
        um.dia = 25;
        um.mes = 12;
        um.ano = 2025;

        Data dois = new Data();
        dois.dia = 31;
        dois.mes = 12;
        dois.ano = 2025;

        System.out.println("O natal será " + um.dia + "/" + um.mes + "/" + um.ano);
        System.out.println("\nO ano novo será " + dois.dia + "/" + dois.mes + "/" + dois.ano);
    }
}
