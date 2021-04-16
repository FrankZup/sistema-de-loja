package mentoria.projeto.contato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    public static List<Endereco> criarListaDeEnderecoPopulado(){
        List<Endereco> enderecos = new ArrayList<>();

        Endereco endereco01 = new Endereco("Rua Ensino", "677", "Barra", "Jaraguá do Sul", "SC");
        Endereco endereco02 = new Endereco("Rua Vestibular", "677", "Barra", "Joinville", "SC");

        enderecos.addAll(Arrays.asList(endereco01, endereco02));

        return enderecos;
    }

    public static Endereco criarEnderecoDaEmpresa(){
        Endereco endereco = new Endereco("R. Virgílio Pedro Rubini", "677", "Barra do Rio Cerro", "Jaraguá do Sul", "SC");
        return endereco;
    }
}
