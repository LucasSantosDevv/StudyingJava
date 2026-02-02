package Collections.Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    static void main(String[] args) {

        ArrayList<Livros> estanteLivros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        Livros l1 = new Livros("livro 1","Zé Ninguém", 2000);
        Livros l2 = new Livros("livro 2","Zé Vazio", 2001);
        Livros l3 = new Livros("livro 3","Zé Sozinho", 2002);
        Livros l4 = new Livros("livro 4","Zé Perdido", 2003);
        Livros l5 = new Livros("livro 5","Zé Achado", 2004);
        Livros l6 = new Livros("livro 6","Zé Aleijado", 2005);
        Livros l7 = new Livros("livro 7","Zé Mané", 2006);
        Livros l8 = new Livros("livro 8","Zé Povinho", 2007);
        Livros l9 = new Livros("livro 9","Zé Ralé", 2008);
        Livros l10 = new Livros("livro 10","Zé Pateta", 2009);

        estanteLivros.add(l1);
        estanteLivros.add(l2);
        estanteLivros.add(l3);
        estanteLivros.add(l4);
        estanteLivros.add(l5);
        estanteLivros.add(l6);
        estanteLivros.add(l7);
        estanteLivros.add(l8);
        estanteLivros.add(l9);
        estanteLivros.add(l10);

        System.out.println("----- Biblioteca Virtual -----");

        while (true){
            System.out.println("\nSelecione uma opção: \n\n1.Adicionar livro \n2.Lista de livros \n3.Buscar livro" +
                    "\n4.Sair");
            int a = entrada.nextInt();

            //Opção 2 do sistema (listar livros)

            if(a == 2){
                for(Livros livros : estanteLivros){
                    System.out.println("Título:" + livros.titulo + " Autor:" + livros.autor + " Ano:" + livros.ano);
                }

            //Opção 3 do sistema (buscar livros)

            }else if(a == 3){
                System.out.println("\nDeseja buscar por: \n1.Título \n2.Autor \n3.Ano");
                int b = entrada.nextInt();
                entrada.nextLine();

                //Opção 3 (busca por título)

                if(b == 1){
                    System.out.println("\nInsira o título completo");
                    String b2 = entrada.nextLine().toLowerCase();

                    Livros livroAchado = null;

                    for(Livros livroBuscado : estanteLivros){
                        if(livroBuscado.titulo.toLowerCase().equals(b2)){
                            livroAchado = livroBuscado;
                            break;
                        }
                    }
                    if(livroAchado !=null){
                        System.out.println("\nLivro encontrado:");
                        System.out.println("Título: " + livroAchado.titulo);
                        System.out.println("Autor: " + livroAchado.autor);
                        System.out.println("Ano: " + livroAchado.ano);
                    }else{
                        System.out.println("Nenhum livro encontrado.");
                    }

                //Opção 3 (busca por autor)

                }else if(b == 2){
                    System.out.println("\nInsira o nome do autor");
                    String b3 = entrada.nextLine().toLowerCase();

                    Livros autorAchado = null;

                    for(Livros autorBuscado : estanteLivros) {
                        if (autorBuscado.autor.toLowerCase().equals(b3)) {
                            autorAchado = autorBuscado;
                            break;
                        }
                    }
                    if(autorAchado != null){
                        System.out.println("\nLivro encontrado:");
                        System.out.println("Título: " + autorAchado.titulo);
                        System.out.println("Autor: " + autorAchado.autor);
                        System.out.println("Ano: " + autorAchado.ano);
                    }else{
                        System.out.println("Nenhum livro encontrado");
                    }

                //Opção 3 (busca por ano)

                }else if(b == 3){
                    System.out.println("Insira o ano do livro");
                    int b4 = entrada.nextInt();

                    ArrayList<Livros> anoLivros = new ArrayList<>();

                    for(Livros anoBuscado : estanteLivros){
                        if(anoBuscado.ano == b4){
                            anoLivros.add(anoBuscado);
                        }
                    }

                    if(anoLivros.isEmpty()){
                        System.out.println("Nenhum livro encontrado");
                    }else{
                        System.out.println("\nLivros encontrados");
                        for(Livros z : anoLivros){
                            System.out.println("Título: " + z.titulo);
                            System.out.println("Autor: " + z.autor);
                            System.out.println("Ano: " + z.ano);
                            System.out.println();
                        }
                    }

                }
            }
            //Opção 1 do sistema (adicionar livros)

            if(a == 1){
                entrada.nextLine();
                System.out.println("Insira o título do livro");
                String tituloNovo = entrada.nextLine();
                System.out.println("Insira o autor do livro");
                String autorNovo = entrada.nextLine();
                System.out.println("Insira o ano do livro");
                int anoNovo = entrada.nextInt();

                estanteLivros.add(new Livros(tituloNovo,autorNovo,anoNovo));
            }
            //Opção 4 do sistema (sair)

            if(a == 4){
                System.out.println("----- Encerrando o sistema -----");
                break;
            }
        }

    }
}
