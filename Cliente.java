package mentoria.projeto;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Endereco> listaDeEnderecos = new ArrayList<>();
    private List<Telefone> listaDeTelefones = new ArrayList<>();

    public Cliente(){}

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

    public void adicionarCliente(Cliente cliente){

        cliente.setNome("Franklin");
        cliente.setEmail("frank@zup");
        cliente.setCpf("061-779-129.58");

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
