package OO.Polimorfismo;

//Classe abstrata serve apenas para gerar heranças para suas subclasses, logo, não pode ser instânciada diretamente.

public abstract class Comidas {

    private double peso;

    Comidas(double peso){
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}

