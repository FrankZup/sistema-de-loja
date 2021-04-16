package mentoria.projeto;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.adicionarCliente(cliente);

        System.out.println(cliente);

        Produto produto = new Produto();
        //Produto produto02 = new Produto();

        produto.adicionarProduto(produto);
        //produto02.adicionarProduto(produto02);

        System.out.println(produto);

        Estoque.adicionarProdutoEstoque(produto);

        Estoque.exibirSaldoPorProdutoEstoque(produto);

        Estoque.aumentarQuantidadeProdutoEmEstoque(produto, 200);

        Estoque.exibirSaldoPorProdutoEstoque(produto);

        Estoque.diminuirQuantidadeProdutoEmEstoque(produto, 50);

        Estoque.exibirSaldoPorProdutoEstoque(produto);

    }
}