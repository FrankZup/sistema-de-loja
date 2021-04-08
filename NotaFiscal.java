package mentoria.projeto;

import java.util.List;

public class NotaFiscal {
    private int numeroNota;
    private Empresa empresa;
    private Cliente cliente;
    private double valorNota;
    private List <NotaFiscalItem> itensNotaFiscal;

    public NotaFiscal() { }

    public int getNumeroNota() { return numeroNota; }
    public void setNumeroNota(int numeroNota) { this.numeroNota = numeroNota; }

    public Empresa getEmpresa() { return empresa; }
    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public double getValorNota() { return valorNota; }
    public void setValorNota(double valorNota) { this.valorNota = valorNota; }

    public List<NotaFiscalItem> getItensNotaFiscal() { return itensNotaFiscal; }
    public void setItensNotaFiscal(List<NotaFiscalItem> itensNotaFiscal) {
        this.itensNotaFiscal = itensNotaFiscal;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "numeroNota=" + numeroNota +
                ", empresa=" + empresa +
                ", cliente=" + cliente +
                ", valorNota=" + valorNota +
                ", itensNotaFiscal=" + itensNotaFiscal +
                '}';
    }
}
