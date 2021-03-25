package mentoria.projeto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.adicionarCliente(cliente);

        System.out.println(cliente);


       Produto produto01 = Produto.adicionar();

        Estoque.adicionarProdutoEstoque(produto01);
        //Estoque.adicionarProdutoEstoque(produto02);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);

        Estoque.aumentarQuantidadeProdutoEmEstoque(produto01, 200);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);

        Estoque.diminuirQuantidadeProdutoEmEstoque(produto01, 50);

        Estoque.exibirSaldoPorProdutoEstoque(produto01);

    }
}
