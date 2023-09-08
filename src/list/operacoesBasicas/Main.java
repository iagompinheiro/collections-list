package list.operacoesBasicas;

import list.operacoesBasicas.CarrinhoCompra;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompra carrinhoCompra = new CarrinhoCompra();

        carrinhoCompra.adicionarItem("Camiseta", 5d, 1);
        carrinhoCompra.adicionarItem("Calça", 2d, 1);

        carrinhoCompra.exibirItens();
        System.out.println("O valor total é: " + carrinhoCompra.calcularValorTotal());


        carrinhoCompra.removeItem("Calça");
        carrinhoCompra.exibirItens();

        System.out.println("O valor total é: " + carrinhoCompra.calcularValorTotal());
    }
}