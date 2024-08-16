package set.Pesquisa;

import java.util.Objects;

public class Contato {

	private String nome;
	private int numero;

	// Constructors
	public Contato() {
	}

	public Contato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	// gets and sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// to string
	@Override
	public String toString() {
		return "\nContato [nome=" + nome + ", numero=" + numero + "]";
	}

	// verificador hashCode por nome
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome);
	}

}
