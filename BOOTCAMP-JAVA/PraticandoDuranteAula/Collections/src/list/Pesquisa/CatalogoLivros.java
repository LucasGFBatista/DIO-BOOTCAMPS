package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livrosCatalogo;

	public CatalogoLivros() {
		this.livrosCatalogo = new ArrayList<>();
	}

	// adicionarLivro(String titulo, String autor, int anoPublicacao):
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

		this.livrosCatalogo.add(new Livro(titulo, autor, anoPublicacao));
	}

	// pesquisarPorAutor(String autor)
	public List<Livro> pesquisarPorAutor(String autor) {

		List<Livro> livroPorAutor = new ArrayList<>();
		if (!livrosCatalogo.isEmpty()) {
			for (Livro livro : livrosCatalogo) {
				if (livro.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(livro);
				}
			}
		}

		return livroPorAutor;

	}

	// pesquisarPorIntervaloAnos(int anoInicial, int anoFinal)
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

		if (!livrosCatalogo.isEmpty()) {
			for (Livro livro : livrosCatalogo) {
				if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(livro);
				}
			}
		}

		return livrosPorIntervaloAnos;

	}

	// pesquisarPorTitulo(String titulo)
	public Livro pesquisarPorTitulo(String titulo) {

		Livro livroPorTitulo = null;

		if (!livrosCatalogo.isEmpty()) {
			for (Livro livro : livrosCatalogo) {
				if (livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
		}

		return livroPorTitulo;

	}

	public int quantidadeLivros() {
		return livrosCatalogo.size();
	}

	// main inicia aqui

	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();

		System.out.println("Quantidade de livros no catalogo: " + catalogo.quantidadeLivros() + "\n");

		catalogo.adicionarLivro("Assim Falou Zaratrusta", "Friedrich Nietzsche", 1883);
		catalogo.adicionarLivro("Atomic Habits", "James Clear", 2018);
		catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
		catalogo.adicionarLivro("O sorriso da hiena", "Gustavo Ávila", 2017);
		catalogo.adicionarLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 2012);

		System.out.println("\nQuantidade de livros no catalogo " + catalogo.quantidadeLivros() + "\n");

		System.out.println("\nPesquisar por titulo: O Pequeno principe\n");
		System.out.println(catalogo.pesquisarPorTitulo("O pequeno príncipe"));

		System.out.println("\nPesquisar por autor: Jame Clear\n");
		System.out.println(catalogo.pesquisarPorAutor("James Clear"));

		System.out.println("\nPesquisar por intervalo de anos: 2010 - 2020\n");
		System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2020));

	}

}
