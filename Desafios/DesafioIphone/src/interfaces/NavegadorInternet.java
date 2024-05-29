package interfaces;

import java.util.Random;

public interface NavegadorInternet {

	Random random = new Random();

	private boolean conexaoComInternet() {
		return random.nextInt(3) == 0;
	}

	default void exibirPagina() {
		if (conexaoComInternet()) {
			System.out.println("Exibindo pagina...");
		} else {
			System.out.println("Sem conexão com internet");
		}
	}

	void adicionarNovaAba();

	void fecharAbaNavegador();

	void atualizarPagina();
	
	void fecharPagina();
}
