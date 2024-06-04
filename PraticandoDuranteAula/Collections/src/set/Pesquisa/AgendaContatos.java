package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}

	// adicionarContato(String nome, int numero)
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}

	// esse não pediu mas eu quis fazer, e é simples

	public int quantidaContato() {
		return contatoSet.size();
	}

	// exibirContatos()
	public void exibirContatos() {
		System.out.println("\n" + contatoSet + "\n");
	}

	// pesquisarPorNome(String nome)
	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> contatoPorNome = new HashSet<>();

		if (!contatoSet.isEmpty()) {
			for (Contato contato : contatoSet) {
				if (contato.getNome().startsWith(nome)) {
					contatoPorNome.add(contato);
				}
			}
		}

		return contatoPorNome;
	}

	// atualizarNumeroContato(String nome, int novoNumero)
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if (!contatoSet.isEmpty()) {
			for (Contato contato : contatoSet) {
				if (contato.getNome().equalsIgnoreCase(nome)) {
					contato.setNumero(novoNumero);
					contatoAtualizado = contato;
					break;
				}
			}
		}

		return contatoAtualizado;
	}

	// main vai aqui

	public static void main(String[] args) {
		AgendaContatos agendaContato = new AgendaContatos();

		System.out.println("Quantidade de contato(s): " + agendaContato.quantidaContato());

		agendaContato.adicionarContato("Lucas", 123456);
		agendaContato.adicionarContato("Lucas Gonçalves", 123457);
		agendaContato.adicionarContato("Lucas Java", 1234568);
		agendaContato.adicionarContato("Lucas Batista", 12378456);
		agendaContato.adicionarContato("Odiosvaldo", 12378456);

		agendaContato.exibirContatos();

		System.out.println("\nQuantidade de contato(s): " + agendaContato.quantidaContato());

		System.out.println("\nTestando hasCode em nome do contato: Lucas Java");

		agendaContato.adicionarContato("Lucas Java", 12345868);

		System.out.println("\nQuantidade de contato(s): " + agendaContato.quantidaContato());

		System.out.println("\nAtualizar contato " + agendaContato.atualizarNumeroContato("Lucas Gonçalves", 987195614));

		System.out.println("\nQuantidade de contato(s): " + agendaContato.quantidaContato());
		agendaContato.exibirContatos();

		System.out.println("\n Pesquisar por contato: Odiosvaldo");

		System.out.println(agendaContato.pesquisarPorNome("Odiosvaldo"));

		System.out.println("\n Pesquisar por contato: Lucas");

		System.out.println(agendaContato.pesquisarPorNome("Lucas"));

	}

}
