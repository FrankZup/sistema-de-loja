package mentoria.projeto.venda;

import mentoria.projeto.cliente.Cliente;
import mentoria.projeto.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private String observacao;
    private Status status;
    private List<ItemPedido> itemPedido = new ArrayList<>();

    public Pedido() {}

    public Pedido(int id, Cliente cliente, String observacao, Status status) {
        this.id = id;
        this.cliente = cliente;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public List<ItemPedido> getItemPedido() { return itemPedido; }
    public void setItemPedido(List<ItemPedido> itemPedido) { this.itemPedido = itemPedido; }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", observacao='" + observacao + '\'' +
                ", status=" + status +
                ", itemPedido=" + itemPedido +
                '}';
    }

    public static Pedido criarPedidoPopulado(Cliente cliente){
        Pedido pedido = new Pedido();

        pedido.setId(1);
        pedido.setCliente(cliente);
        pedido.setObservacao("");
        pedido.setStatus(Status.NOVO);

        return pedido;
    }
}
