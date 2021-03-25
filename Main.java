package mentoria.projeto;

import mentoria.projeto.enums.Categoria;

public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto(1, "TV Samsung", 1000, Categoria.ELETRODOMESTICO);
        Produto produto02 = new Produto(2, "Notebook Samsung", 2000, Categoria.ELETRODOMESTICO);

        Estoque.adicionarProdutoEstoque(produto01);
        Estoque.adicionarProdutoEstoque(produto02);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);

        Estoque.aumentarQuantidadeProdutoEmEstoque(produto01, 200);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);
        
        Estoque.diminuirQuantidadeProdutoEmEstoque(produto01, 50);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);

    }
}
