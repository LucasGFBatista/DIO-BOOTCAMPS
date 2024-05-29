package interfaces;

import model.Contato;

public interface AparelhoTelefonico {

	boolean redeMovelDisponivel();

	void ligar(String numero);

	void ligar(Contato contato);

	void atender();

	void vivaVoz();

	void inciarCorreioVoz();

	void silenciar();

}
