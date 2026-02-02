package OO.Abstrata;

/*A classe abstrata serve para gerar herança (não pode ser instânciada diretamente), ela também permite a criação de metodos abstratos
(metodos que não podem ser comuns entre todos os herdeiros), que são incompletos na super classe e pode ser implementados apenas nas classes
herdeiras */

public abstract class Animal {

    private String mamiferos;
    private String repteis;
    private String anfibios;
    private String especie;

    public String getMamiferos() {
        return mamiferos;
    }
    public String getRepteis() {
        return repteis;
    }
    public String getAnfibios() {
        return anfibios;
    }
    public String getEspecie() {
        return especie;
    }

    public void setMamiferos(String mamiferos) {
        this.mamiferos = mamiferos;
    }
    public void setRepteis(String repteis) {
        this.repteis = repteis;
    }
    public void setAnfibios(String anfibios) {
        this.anfibios = anfibios;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    void respirar(){
        IO.println("CO2");
    }
     abstract String locomocao();       //Metodo abstrato

}
