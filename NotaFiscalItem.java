package mentoria.projeto;

public class NotaFiscalItem {
    private Produto produto;
    private int quantidade;
    private double valorUnitario;

    public NotaFiscalItem() {}

    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getValorUnitario() { return valorUnitario; }
    public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }

    @Override
    public String toString() {
        return "NotaFiscalItem{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
