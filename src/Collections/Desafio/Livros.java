package Collections.Desafio;

/*
DESAFIO: Sistema de Biblioteca Básico
Objetivo: Criar um sistema simples de gerenciamento de livros, permitindo adicionar, listar e buscar livros.

Regras
1. Crie uma classe Livro com os atributos:

* String titulo;
* String autor;
* int ano;
* Métodos;
* Construtor;
* (Opcional) implementar equals() e hashCode() se quiser evitar duplicados no Set;

2. Crie uma classe SistemaBiblioteca Nesta classe faça:

* Um ArrayList<Livro> para armazenar os livros

* Um menu em loop (while) com as opções:
 - Adicionar livro
 - Listar todos os livros
 - Buscar livro por título
 - Sair

3. Funcionalidades

* OPÇÃO 1 — Adicionar livro
 - Perguntar título, autor e ano usando Scanner
 - Criar um objeto Livro
 - Adicionar ao ArrayList
 - Caso já exista um livro com mesmo título e autor (se quiser usar equals), não adicionar.

* OPÇÃO 2 — Listar livros
 - Caso a lista esteja vazia, avisar.
 - Caso haja livros, imprimir todos usando um foreach.

* OPÇÃO 3 — Buscar por título
 - Perguntar o título a buscar
 - Percorrer a lista
 - Se encontrar, mostrar o livro
 - Se não encontrar, informar que não existe

* OPÇÃO 4 — Sair
 - Finalizar o loop.
*/

import java.util.Objects;

public class Livros {

    String titulo;
    String autor;
    int ano;

    Livros(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return ano == livros.ano && Objects.equals(titulo, livros.titulo) && Objects.equals(autor, livros.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, ano);
    }
}
