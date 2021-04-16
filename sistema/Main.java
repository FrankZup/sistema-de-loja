package mentoria.projeto.sistema;

import mentoria.projeto.cliente.Cliente;
import mentoria.projeto.contato.Endereco;
import mentoria.projeto.contato.Telefone;
import mentoria.projeto.empresa.Empresa;
import mentoria.projeto.fiscal.Fiscal;
import mentoria.projeto.produto.Estoque;
import mentoria.projeto.produto.Produto;
import mentoria.projeto.venda.ItemPedido;
import mentoria.projeto.venda.Pedido;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Endereco enderecoEmpresa = Endereco.criarListaDeEnderecoPopulado().get(0);
        Telefone telefoneEmpresa = Telefone.criarTelefonePopulado().get(0);

        Cliente cliente = Cliente.criarClientePopulado();

        Produto produto01 = Produto.criarProdutoPopulado();
        Produto produto02 = Produto.criarProdutoPopulado02();

        Pedido pedido = Pedido.criarPedidoPopulado(cliente);

        ItemPedido itemPedido01 = new ItemPedido(produto01, 5);
        ItemPedido itemPedido02 = new ItemPedido(produto02, 10);

        pedido.getItemPedido().addAll(Arrays.asList(itemPedido01, itemPedido02));

        Fiscal fiscal = new Fiscal();

        Estoque.adicionarProdutoEstoque(produto01);
        Estoque.aumentarQuantidadeProdutoEmEstoque(produto01, 10);

        Estoque.adicionarProdutoEstoque(produto02);
        Estoque.aumentarQuantidadeProdutoEmEstoque(produto02, 10);

        for (ItemPedido itensPedido : pedido.getItemPedido()) {
            Estoque.diminuirQuantidadeProdutoEmEstoque(itensPedido.getProduto(), itensPedido.getQuantidade());
        }

        System.out.println(fiscal.emitirNotaFiscal(pedido));
    }
}
