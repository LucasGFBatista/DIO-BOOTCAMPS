package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	// adicionarConvidado(String nome, int codigoConvite)
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));

	}

	// removerConvidadoPorCodigoConvite(int codigoConvite)
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRomover = null;

		if (!convidadoSet.isEmpty()) {
			for (Convidado convidado : convidadoSet) {
				if (convidado.getCodigoConvite() == codigoConvite) {
					convidadoParaRomover = convidado;
					break;
				}
			}
		}

		convidadoSet.remove(convidadoParaRomover);
	}

	// contarConvidados()
	public int contarConvidados() {
		return convidadoSet.size();
	}

	// exibirConvidados()
	public void exibirConvidados() {
		System.out.println("\n" + convidadoSet + "\n");
	}

	// main vai aqui
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

		System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " dentro do Set Conidados");

		conjuntoConvidados.adicionarConvidado("Lucas", 14550);
		conjuntoConvidados.adicionarConvidado("Ana", 14750);
		conjuntoConvidados.adicionarConvidado("Ceci", 18450);
		conjuntoConvidados.adicionarConvidado("Elly", 14850);
		conjuntoConvidados.adicionarConvidado("Clone", 14550);

		System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " dentro do Set Conidados");

		conjuntoConvidados.exibirConvidados();

		conjuntoConvidados.removerConvidadoPorCodigoConvite(14550);

		System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " dentro do Set Conidados");

		conjuntoConvidados.exibirConvidados();

	}

}
