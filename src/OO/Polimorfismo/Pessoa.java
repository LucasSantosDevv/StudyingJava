package OO.Polimorfismo;

public class Pessoa {

    private double peso;
    private String nome;


    Pessoa(double peso, String nome){
        setPeso(peso);
        setNome(nome);
    }

    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    void comer (Comidas c){
        this.peso += c.getPeso();
    }
}
