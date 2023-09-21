package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();
        cp.adicionarProduto(322662, "carro", 500.0, 1);
        cp.adicionarProduto(565489, "macbook", 25.0, 1);
        cp.adicionarProduto(564852, "ps5", 30.0, 1);
        cp.adicionarProduto(322662, "pcgamer", 35.0, 1);

        System.out.println(cp.produtoSet);

        System.out.println(cp.exibirProdutosPorNome());

        System.out.println(cp.exibirProdutosPorPreco());
    }

}
