package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutoMap;

	public EstoqueProdutos() {
		this.estoqueProdutoMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutoMap.put(cod, new Produto(nome, quantidade, preco));
	}

	public void exibirProdutos() {
		System.out.println("Produto: " + estoqueProdutoMap);
	}
	
	
	public int quantidadeEstoque() {
		return estoqueProdutoMap.size();
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;

		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto produto : estoqueProdutoMap.values()) {
				valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
			}
		}

		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {

		Produto produtoMaisCaro = null;
		double maiorPreco = Double.MIN_VALUE;

		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto produto : estoqueProdutoMap.values()) {
				if (produto.getPreco() > maiorPreco) {
					produtoMaisCaro = produto;
					maiorPreco = produto.getPreco();
				}
			}
		}
		return produtoMaisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;

		if (!estoqueProdutoMap.isEmpty()) {
			for (Produto produto : estoqueProdutoMap.values()) {
				if (produto.getPreco() < menorPreco) {
					produtoMaisBarato = produto;
					menorPreco = produto.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}

	  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		    Produto produtoMaiorQuantidadeValorNoEstoque = null;
		    double maiorValorTotalProdutoEstoque = 0d;
		    if (!estoqueProdutoMap.isEmpty()) {
		      for (Map.Entry<Long, Produto> entry : estoqueProdutoMap.entrySet()) {
		        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
		        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
		          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
		          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
		        }
		      }
		    }
		    return produtoMaiorQuantidadeValorNoEstoque;
		  }


	// main
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

		estoqueProdutos.adicionarProduto(0, "Camiseta", 10, 29.90);
		estoqueProdutos.adicionarProduto(1, "Calça Jeans", 8, 79.90);
		estoqueProdutos.adicionarProduto(2, "Sapato Tênis", 5, 129.90);
		estoqueProdutos.adicionarProduto(3, "Smartphone", 1, 1999.90);
		estoqueProdutos.adicionarProduto(3, "Notebook", 2, 3999.90);
		estoqueProdutos.adicionarProduto(5, "Televisão", 1, 1499.90);
		estoqueProdutos.adicionarProduto(6, "Geladeira", 1, 2499.90);
		estoqueProdutos.adicionarProduto(7, "Fogão", 1, 999.90);
		estoqueProdutos.adicionarProduto(8, "Micro-ondas", 1, 599.90);
		estoqueProdutos.adicionarProduto(9, "Cafeteira", 1, 199.90);
		
		System.out.println("Quantidade de produto: " + estoqueProdutos.quantidadeEstoque());
		
		estoqueProdutos.exibirProdutos();
		
		
		System.out.println("\nCalcular valor total do estoque");
		System.out.println(estoqueProdutos.calcularValorTotalEstoque());

		
		System.out.println("\nProduto mais Barato");
		System.out.println(estoqueProdutos.obterProdutoMaisBarato());
		
		
		System.out.println("\nProduto mais Caro");
		System.out.println(estoqueProdutos.obterProdutoMaisCaro());
		
		
		System.out.println("\nProduto mais Mairo quantidade valor no estoque");
		System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
		
	}

}
