package mentoria.projeto.produto;

import mentoria.projeto.enums.Categoria;
import mentoria.projeto.venda.ItemPedido;

public class Produto {
    private int id;
    private String nome;
    private double precoCusto;
    private Categoria categoria;

    public Produto() {}

    public Produto(int id, String nome, double precoCusto, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPrecoCusto() { return precoCusto; }
    public void setPrecoCusto(double precoCusto) { this.precoCusto = precoCusto; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public static Produto criarProdutoPopulado(){
        Produto produto = new Produto();

        produto.setId(1);
        produto.setNome("Fogão");
        produto.setPrecoCusto(299.00);
        produto.setCategoria(Categoria.ELETRODOMESTICO);

        return produto;
    }

    public static Produto criarProdutoPopulado02(){
        Produto produto = new Produto();

        produto.setId(2);
        produto.setNome("Computador");
        produto.setPrecoCusto(1500.00);
        produto.setCategoria(Categoria.INFORMATICA);

        return produto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", precoCusto=" + precoCusto +
                ", categoria=" + categoria +
                '}';
    }
}
