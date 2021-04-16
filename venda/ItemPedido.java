package mentoria.projeto.venda;

import mentoria.projeto.produto.Produto;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private double valorProduto;

    public ItemPedido() {}

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValorProduto() { return valorProduto; }
    public void setValorProduto(double valorProduto) { this.valorProduto = valorProduto; }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorProduto=" + valorProduto +
                '}';
    }

    public static ItemPedido criarItemPedidoPopulado(Produto produto){
        ItemPedido itemPedido = new ItemPedido();

        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(10);

        return itemPedido;

    }
}
