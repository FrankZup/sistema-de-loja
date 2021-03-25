package mentoria.projeto;

import java.util.HashMap;

public class Estoque {

    private HashMap<Produto, Integer> produtosEstoque = new HashMap<>();

    public void adicionarProdutoEstoque(Produto produto) {
        produtosEstoque.put(produto, 0);
    }

    public void removerProdutoEstoque(Produto produto){
        produtosEstoque.remove(produto);
    }
}
