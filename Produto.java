package mentoria.projeto;

import mentoria.projeto.enums.Categoria;

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

    public static Produto adicionar(){

        Produto produto01 = new Produto();

        produto01.setId(1);
        produto01.setNome("Fogão");
        produto01.setPrecoCusto(299.00);
        produto01.setCategoria(Categoria.ELETRODOMESTICO);

        return produto01;
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
