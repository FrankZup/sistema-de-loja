package mentoria.projeto.contato;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Telefone {
    private String numero;

    public Telefone(String numero) {
        this.numero = numero;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero='" + numero + '\'' +
                '}';
    }

    public static List<Telefone> criarTelefonePopulado(){
        List<Telefone> telefones = new ArrayList<>();

        Telefone telefone01 = new Telefone("3376-0716");
        Telefone telefone02 = new Telefone("9289-7919");

        telefones.addAll(Arrays.asList(telefone01, telefone02));

        return telefones;
    }

    public static Telefone criarTelefoneDaEmpresa(){
        Telefone telefone = new Telefone("3376-0716");
        return telefone;
    }
}
