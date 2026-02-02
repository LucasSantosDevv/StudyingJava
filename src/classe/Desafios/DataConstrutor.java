package classe.Desafios;

public class DataConstrutor {

    int dia;
    int mes;
    int ano;

    DataConstrutor () {  //Criação do construtor padrão
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    DataConstrutor (int dia, int mes, int ano){     //Criação do construtor modificado
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada(){      //Criação do metodo (para formatar a data)
        final String formatacao = "%d/%d/%d";
        return String.format(formatacao, this.dia, mes, ano);
    }
}
