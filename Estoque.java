package mentoria.projeto;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    private static HashMap<Produto, Integer> produtosEstoque = new HashMap<>();

    public void adicionarProdutoEstoque(Produto produto) {
        produtosEstoque.put(produto, 0);
    }

    public void removerProdutoEstoque(Produto produto){
        produtosEstoque.remove(produto);
    }

    public static int verificarSaldoAtualProdutoEstoque(Produto produto){
        return produtosEstoque.get(produto).intValue();
    }

    public static void exibirSaldoPorProdutoEstoque(Produto produto){
        System.out.printf("Produto "+produto.getNome()+ " tem "+
                           verificarSaldoAtualProdutoEstoque(produto) + " quantidades em estoque");
    }

    public static void exibirSaldoPorProduto(){
        for (Map.Entry<Produto, Integer> estoquePorProduto : produtosEstoque.entrySet()){
            exibirSaldoPorProdutoEstoque(estoquePorProduto.getKey());
        }
    }
}
