package Collections;

import java.util.Objects;

public class ListObjetos {

    String nome;

    ListObjetos(String nome){       //Construtor
        this.nome = nome;
    }

    public String toString(){       //Metodo
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object o) {       //Equals
        if (o == null || getClass() != o.getClass()) return false;
        ListObjetos that = (ListObjetos) o;
        return Objects.equals(nome, that.nome);
    }
}
