package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoParaAtualizar = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoParaAtualizar = c;
                break;
            }
        }
        return contatoParaAtualizar;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Contato 1", 563254);
        ac.adicionarContato("Contato 2", 53254);
        ac.adicionarContato("Contato 3", 56325);
        ac.pesquisaPorNome("Contato 1");
        System.out.println(ac.pesquisaPorNome("Contato 1"));
        ac.exibirContatos();
        ac.atualizarNumeroContato("Contato 2", 6598);
        ac.exibirContatos();
    }

}
