package mentoria.projeto.cliente;

import mentoria.projeto.contato.Endereco;
import mentoria.projeto.contato.Telefone;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Endereco> listaDeEnderecos = new ArrayList<>();
    private List<Telefone> listaDeTelefones = new ArrayList<>();

    public Cliente(){}

    public Cliente(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<Endereco> getListaDeEnderecos() { return listaDeEnderecos; }
    public void setListaDeEnderecos(List<Endereco> listaDeEnderecos) {
        this.listaDeEnderecos = listaDeEnderecos;
    }

    public List<Telefone> getListaDeTelefones() { return listaDeTelefones; }

    public void setListaDeTelefones(List<Telefone> listaDeTelefones) {
        this.listaDeTelefones = listaDeTelefones;
    }

    public static Cliente criarClientePopulado(){
        Cliente cliente = new Cliente();

        cliente.setNome("Franklin");
        cliente.setEmail("frank@zup");
        cliente.setCpf("061-779-129.58");

        cliente.getListaDeEnderecos().add(
                new Endereco("Rua", "122", "Barra", "Jgua", "SC"));

        cliente.getListaDeTelefones().add(new Telefone("333-3562"));

        return cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", listaDeEnderecos=" + listaDeEnderecos +
                ", listaDeTelefones=" + listaDeTelefones +
                '}';
    }
}
