package model;

public class Musica {
	private String nome;
	private String nomeArtista;

	// Construcotrs
	public Musica() {
	}

	public Musica(String nome, String nomeArtista) {
		this.nome = nome;
		this.nomeArtista = nomeArtista;
	}

	
	//getters adn setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	
	

}
