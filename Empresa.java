package mentoria.projeto;

public class Empresa {
    private String cnpj;
    private String nomeEmpresa;
    private Telefone telefone;
    private Endereco endereco;

    public Empresa() {}

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getNomeEmpresa() { return nomeEmpresa; }
    public void setNomeEmpresa(String nomeEmpresa) { this.nomeEmpresa = nomeEmpresa; }

    public Telefone getTelefone() { return telefone; }
    public void setTelefone(Telefone telefone) { this.telefone = telefone; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

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
