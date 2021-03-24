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

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", listaDeEnderecos=" + listaDeEnderecos +
                ", listaDeTelefones=" + listaDeTelefones +
                '}';
    }
}
