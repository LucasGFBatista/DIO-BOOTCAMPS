package set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
	private long cod;
	private String nome;
	private double preco;
	private int quantidade;

	// Contrutores
	public Produto() {
	}

	public Produto(long cod, String nome, double preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Metodo herdado de Iterface Comparable
	@Override
	public int compareTo(Produto p) {

		return nome.compareToIgnoreCase(p.getNome());
	}

	// getters and setters
	public long getCod() {
		return cod;
	}

	public void setCod(long cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double subTotal(int quantidade, double preco) {

		return quantidade * preco;
	}

	// HashCode por codigo do produto
	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public String toString() {
		return "\nProduto [ Codigo: " + cod + " | Nome: " + nome + " | R$ " + preco + " | Quantidade: " + quantidade
				+ " | SubTotal: R$" + subTotal(quantidade, preco) + "]\t";
	}

}
