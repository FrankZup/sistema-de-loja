package mentoria.projeto.fiscal;

import mentoria.projeto.produto.Produto;

public class NotaFiscalItem {
    private Produto produto;
    private int quantidade;
    private double valorUnitario;

    public NotaFiscalItem(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }

    public static double calcularValorUnitarioProduto(Produto produto){

        double taxa = produto.getPrecoCusto() * 0.10;
        return produto.getPrecoCusto() + taxa;
    }

    @Override
    public String toString() {
        return "NotaFiscalItem{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
