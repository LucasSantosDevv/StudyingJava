package streams.Desafio;

import java.util.Objects;

public class ReduceConstructor {
    String nome;
    public double nota;

    public ReduceConstructor(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " tem a nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReduceConstructor that = (ReduceConstructor) o;
        return Double.compare(nota, that.nota) == 0 && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
