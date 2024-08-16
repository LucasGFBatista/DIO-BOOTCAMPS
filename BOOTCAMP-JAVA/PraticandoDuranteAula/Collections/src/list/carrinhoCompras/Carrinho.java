package list.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Item> itemLista;

	public Carrinho() {
		this.itemLista = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);

		this.itemLista.add(new Item(nome, preco, quantidade));

	}

	// removerItem(String nome)
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();

		if (!itemLista.isEmpty()) {
			for (Item i : itemLista) {
				if (i.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(i);
				}
			}

			itemLista.removeAll(itensParaRemover);
		} else {
			System.out.println("Carrinho está vazio");
		}
	}

	// calcularValorTotal()

	public double calcularValorTotal() {

		double valorTotal = 0d;

		if (!itemLista.isEmpty()) {
			for (Item item : itemLista) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		} else {
			System.out.println("Carrinho está vazio");
			return 0;
		}
	}

	// exibirItens()
	public void exibirItens() {
		if (!itemLista.isEmpty()) {
			System.out.println(this.itemLista);
			
		} else {
			System.out.println("Carrinho está vazio");
		}

	}

	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
		
		

		carrinho.adicionarItem("Milho verde", 5.30, 2);
		carrinho.adicionarItem("Cotonete", 10, 1);
		carrinho.adicionarItem("Agua com gás", 2.5, 5);
		carrinho.adicionarItem("Cotonete", 10, 1);
		
		carrinho.exibirItens();

		System.out.println("\nO valor total é R$" + carrinho.calcularValorTotal() + "\n");

		//remover itens
		
		carrinho.removerItem("Cotonete");
		
		carrinho.exibirItens();

		System.out.println("\nO valor total é R$" + carrinho.calcularValorTotal());
		
	}

}
