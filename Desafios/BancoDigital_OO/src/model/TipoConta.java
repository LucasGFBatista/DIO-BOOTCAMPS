package model;

public enum TipoConta {

	CORRENTE("Conta Corrente", "CC"), POUPANCA("Conta Poupança", "CP");

	private String nomeTipo;
	private String siglaTipo;

	private TipoConta(String nomeTipo, String siglaTipo) {
		this.nomeTipo = nomeTipo;
		this.siglaTipo = siglaTipo;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	public String getSiglaTipo() {
		return siglaTipo;
	}
	
	

}
