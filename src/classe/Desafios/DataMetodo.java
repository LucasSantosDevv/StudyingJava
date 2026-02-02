package classe.Desafios;

/*Desafio: utilizar o 'metodo' dentro do desafio da data, sem utilizar o 'System.out.println()' para concatenar
e/ou formatar a data                                                                       */

public class DataMetodo {

    int dia;
    int mes;
    int ano;

    String DATA() {                     //1ª forma
        return dia + "/" + mes + "/" + ano;
    }

    String DATAfORMATADA(){             //2ª forma
        return String.format("%d/%d/%d", dia, mes, ano);
        }
}
