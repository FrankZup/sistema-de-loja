package mentoria.projeto.fiscal;

import mentoria.projeto.venda.ItemPedido;
import mentoria.projeto.venda.Pedido;
import mentoria.projeto.empresa.Empresa;

import java.util.List;

public class Fiscal extends Empresa {

    public NotaFiscal emitirNotaFiscal(Pedido pedido){

        NotaFiscal notaFiscal = new NotaFiscal(1, this, pedido.getCliente());
        popularItensDaNota(notaFiscal, pedido.getItemPedido());

        notaFiscal.setValorNota(NotaFiscal.calcularValorTotalNota(notaFiscal.getItensNotaFiscal()));

        return notaFiscal;
    }

    public static void popularItensDaNota(NotaFiscal notaFiscal, List<ItemPedido> listaItemPedido){

        for (ItemPedido itens : listaItemPedido){

            NotaFiscalItem notaFiscalItem = new NotaFiscalItem(itens.getProduto(), itens.getQuantidade());
            notaFiscalItem.setValorUnitario(NotaFiscalItem.calcularValorUnitarioProduto(itens.getProduto()));

            notaFiscal.getItensNotaFiscal().add(notaFiscalItem);
        }
    }
}
