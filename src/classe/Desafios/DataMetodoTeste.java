package classe.Desafios;


public class DataMetodoTeste {
    static void main(String[] args) {

        DataMetodo data1 = new DataMetodo();
        data1.dia = 31;
        data1.mes = 12;
        data1.ano = 2025;

        DataMetodo data2 = new DataMetodo();
        data2.dia = 25;
        data2.mes = 12;
        data2.ano = 2025;

        String data = data1.DATA();
        String dataFormatada = data2.DATAfORMATADA();

        System.out.println(data);
        System.out.println(dataFormatada);
    }
}

