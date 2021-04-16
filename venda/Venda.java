package mentoria.projeto;

public class Venda {
    private int id;
    private Fiscal fiscal;

    public Venda() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Fiscal getFiscal() { return fiscal; }
    public void setFiscal(Fiscal fiscal) { this.fiscal = fiscal; }

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", fiscal=" + fiscal +
                '}';
    }
}
