package map.Ordenacao;

public class Evento {

	private String nomeEvento;
	private String atracaoEvento;

	public Evento() {
	}

	public Evento(String nomeEvento, String atracaoEvento) {
		this.nomeEvento = nomeEvento;
		this.atracaoEvento = atracaoEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getAtracaoEvento() {
		return atracaoEvento;
	}

	public void setAtracaoEvento(String atracaoEvento) {
		this.atracaoEvento = atracaoEvento;
	}

	@Override
	public String toString() {
		return " | Nome Evento: " + nomeEvento + " | Atracao Evento: " + atracaoEvento + "\n";
	}

}
