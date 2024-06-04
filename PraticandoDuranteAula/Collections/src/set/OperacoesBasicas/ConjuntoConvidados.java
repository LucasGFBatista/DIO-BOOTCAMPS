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
		System.out.println(convidadoSet);
	}
	
	
	
	

}
