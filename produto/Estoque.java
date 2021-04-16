package mentoria.projeto.produto;

import mentoria.projeto.fiscal.Fiscal;
import mentoria.projeto.fiscal.NotaFiscal;
import mentoria.projeto.venda.ItemPedido;
import mentoria.projeto.venda.Pedido;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private static HashMap<Produto, Integer> produtosEstoque = new HashMap<>();

    public static void adicionarProdutoEstoque(Produto produto) {
        produtosEstoque.put(produto, 0);
    }

    public static void removerProdutoEstoque(Produto produto){
        produtosEstoque.remove(produto);
    }

    public static int verificarSaldoAtualProdutoEstoque(Produto produto){
        return produtosEstoque.get(produto).intValue();
    }

    public static void exibirSaldoPorProdutoEstoque(Produto produto){
        System.out.printf("Produto "+produto.getNome()+ " tem "+
                           verificarSaldoAtualProdutoEstoque(produto) +
                          " quantidades em estoque\n");
    }

    public static boolean saldoDisponivelEmEstoque(Produto produto, int quantidade){
        return verificarSaldoAtualProdutoEstoque(produto) >= quantidade;
    }

    public static void exibirSaldoPorProduto(){
        for (Map.Entry<Produto, Integer> estoquePorProduto : produtosEstoque.entrySet()){
            exibirSaldoPorProdutoEstoque(estoquePorProduto.getKey());
        }
    }

    public static void aumentarQuantidadeProdutoEmEstoque(Produto produto, int quantidade){

        verificarProdutoExisteEmEstoque(produto);

        int novaQuantidade = verificarSaldoAtualProdutoEstoque(produto) + quantidade;
        produtosEstoque.put(produto, novaQuantidade);
    }

    public static void diminuirQuantidadeProdutoEmEstoque(Produto produto, int quantidade){
        verificarProdutoExisteEmEstoque(produto);
        validarSaldoEstoque(produto, quantidade);
        if (saldoDisponivelEmEstoque(produto, quantidade)){
            int novaQuantidade = verificarSaldoAtualProdutoEstoque(produto) - quantidade;
            produtosEstoque.put(produto, novaQuantidade);
        }
    }

    public static void validarSaldoEstoque(Produto produto, int quantidade){
        int quantidadeEstoque = verificarSaldoAtualProdutoEstoque(produto);

        if (produtosEstoque.containsKey(produto)) {

            if (quantidade > quantidadeEstoque) {
                throw new RuntimeException("Produto indisponivel no estoque");
            }
        }
    }

    public static void verificarProdutoExisteEmEstoque(Produto produto){
        if (!produtosEstoque.containsKey(produto)) {
            throw new RuntimeException("Produto não cadastrado no estoque!");
        }
    }
}
