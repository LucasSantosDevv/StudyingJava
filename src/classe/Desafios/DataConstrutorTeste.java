package classe.Desafios;

public class DataConstrutorTeste {
    static void main(String[] args) {

        DataConstrutor d1 = new DataConstrutor();   //Chamei o construtor padrão
        DataConstrutor d2 = new DataConstrutor(31, 12, 2025);   //Chamei o construtor modificado

        System.out.println(d1.dataFormatada());
        System.out.println("\n" + d2.dataFormatada());
    }
}
