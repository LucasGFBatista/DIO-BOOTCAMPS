package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	// adicionarContato(String nome, Integer telefone):
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	// removerContato(String nome)
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}

	// exibirContatos()
	public void exibirContatos() {
		System.out.println("\n" + agendaContatoMap);
	}

	// pesquisarPorNome(String nome)
	public Integer pesquisarPorNome(String nome) {

		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}

		return numeroPorNome;
	}

	// main aqui
	public static void main(String[] args) {
		AgendaContatos agendaContato = new AgendaContatos();

		agendaContato.adicionarContato("Lucas", 987195614);
		agendaContato.adicionarContato("Roberto Carlos", 98719);
		agendaContato.adicionarContato("Lucas Gonçalves", 5614);
		agendaContato.adicionarContato("aaaaaaaaaa", 98719);

		agendaContato.exibirContatos();

		System.out.println("Pesquisa por nome: " + agendaContato.pesquisarPorNome("Lucas"));

	}

}
