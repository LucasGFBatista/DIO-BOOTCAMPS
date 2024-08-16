package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> listaPessoas;

	public OrdenacaoPessoa() {
		this.listaPessoas = new ArrayList<>();
	}

	// adicionarPessoa(String nome, int idade, double altura)
	public void adicionarPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa(nome, idade, altura);

		this.listaPessoas.add(new Pessoa(nome, idade, altura));

	}

	// ordenarPorIdade()

	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);

		return pessoasPorIdade;
	}

	// ordenarPorAltura()

	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(listaPessoas);

		Collections.sort(listaPessoas, new ComparatorPorAltura());

		return listaPessoas;
	}

	// main vai aqui

	public static void main(String[] args) {

		OrdenacaoPessoa pessoa = new OrdenacaoPessoa();

		pessoa.adicionarPessoa("Ana", 30, 1.65);
		pessoa.adicionarPessoa("Lucas", 25, 1.69);
		pessoa.adicionarPessoa("Elly", 45, 1.63);
		pessoa.adicionarPessoa("Keu", 49, 1.66);

		System.out.println("Ordenando por idade");
		System.out.println(pessoa.ordenarPorIdade());

		System.out.println("\nOrdenando por altura");
		System.out.println(pessoa.ordenarPorAltura());

	}
}
