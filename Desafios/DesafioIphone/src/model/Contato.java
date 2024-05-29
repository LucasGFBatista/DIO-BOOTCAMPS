package model;

public class Contato {
	private String nome;
	private String numero;

	// Construcors

	public Contato() {

	}

	public Contato(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
