package mentoria.projeto.empresa;

import mentoria.projeto.contato.Endereco;
import mentoria.projeto.contato.Telefone;

public class Empresa {
    private final String cnpj = "12345";
    private final String nomeEmpresa = "Loja do Frankllin";
    private final Telefone telefone = Telefone.criarTelefoneDaEmpresa();
    private final Endereco endereco = Endereco.criarEnderecoDaEmpresa();

    public Empresa() {}

    public String getCnpj() { return cnpj; }
    public String getNomeEmpresa() { return nomeEmpresa; }
    public Telefone getTelefone() { return telefone; }
    public Endereco getEndereco() { return endereco; }

    @Override
    public String toString() {
        return "Empresa{" +
                "cnpj='" + cnpj + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", telefone=" + telefone +
                ", endereco=" + endereco +
                '}';
    }
}
