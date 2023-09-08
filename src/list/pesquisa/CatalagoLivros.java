package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosIntervaloAnos.add(l);
                }
            }
        }
        return livrosIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo))
                    livroPorTitulo = l;
                break;
            }

        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 1985);
        catalagoLivros.adicionarLivro("Livro 1", "Autor 2", 1986);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 2", 1987);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 4", 1988);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 5", 1989);

        System.out.println("Pesquisa por autor: " + catalagoLivros.pesquisaPorAutor("Autor 2"));
        System.out.println("Intervalo de anos: " + catalagoLivros.pesquisarPorIntervaloAnos(1988, 2000));
        System.out.println("Pesquisa por título: " + catalagoLivros.pesquisaPorTitulo("Livro 1"));
    }


}
