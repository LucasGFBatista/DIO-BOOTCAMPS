package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}

//adicionarProduto(long cod, String nome, double preco, int quantidade)
	void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}

	// quantidade de produtos
	public int quantidadeProdutos() {
		return produtoSet.size();
	}

//exibirProdutosPorNome()

	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

		return produtosPorNome;
	}

//exibirProdutosPorPreco()

	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);

		return produtoPorPreco;
	}

	// main vai aaqui

	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();

		System.out.println("\nQuantidade de produtos: " + cadastroProdutos.quantidadeProdutos());

		cadastroProdutos.adicionarProduto(12345679, "Milho pipoca", 6.40d, 5);
		cadastroProdutos.adicionarProduto(12345679, "Milho pipoca", 6.0d, 3);
		cadastroProdutos.adicionarProduto(12345689, "Milho pipoca", 6.2d, 4);
		cadastroProdutos.adicionarProduto(12345659, "Milho verde", 4.3d, 2);
		cadastroProdutos.adicionarProduto(12345639, "Café perna de grilo", 7.89d, 6);

		
		
		System.out.println("\n" + cadastroProdutos.produtoSet);
		System.out.println("\nQuantidade de produtos: " + cadastroProdutos.quantidadeProdutos());

		System.out.println("\nOrdenar por nome");
		System.out.println(cadastroProdutos.exibirProdutosPorNome());

		System.out.println("\nOrdenar por preço");
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());

	}
}
