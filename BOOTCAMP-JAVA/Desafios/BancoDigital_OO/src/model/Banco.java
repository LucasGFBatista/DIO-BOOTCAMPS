package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.ContaCorrente;
import service.ContaPoupanca;

public class Banco {

	private String nome;
	private List<Conta> contas;

	// Constructors
	public Banco() {
	}

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	// Criar contas
	// Corrente
	public void criarContaCorrente(Cliente cliente) {
		contas.add(new ContaCorrente(cliente));
	}

	// Conta poupança
	public void criarContaPoupanca(Cliente cliente) {
		contas.add(new ContaPoupanca(cliente));
	}

	// Exibir dados das contas
	private void imprimirConta(Conta conta) {
		System.out.println("---------------------------------");
		System.out.println("Titular: " + conta.cliente.getNome());
		System.out.println("Tipo Conta: " + conta.getTipoConta().getNomeTipo());
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número: " + conta.getNumero());

	}

	// Exibir contas ordenadas por tipo de conta
	public void exibirTodasContasOrdenadas() {
		// Crie um mapa para armazenar as contas agrupadas por tipo de conta
		Map<TipoConta, List<Conta>> contasAgrupadas = new HashMap<>();

		// Agrupe as contas por tipo
		for (Conta conta : contas) {
			TipoConta tipoConta = conta.getTipoConta();
			List<Conta> listaContasTipo = contasAgrupadas.getOrDefault(tipoConta, new ArrayList<>());
			listaContasTipo.add(conta);
			contasAgrupadas.put(tipoConta, listaContasTipo);
		}

		// Ordene as listas de contas por número de conta
		for (Map.Entry<TipoConta, List<Conta>> entry : contasAgrupadas.entrySet()) {
			entry.getValue().sort((c1, c2) -> {
				int comparacaoAgencia = Integer.compare(c1.getAgencia(), c2.getAgencia());
				if (comparacaoAgencia != 0) {
					return comparacaoAgencia;
				}
				return Integer.compare(c1.getNumero(), c2.getNumero());
			});
		}

		// Imprima as contas agrupadas e ordenadas
		System.out.println("\n=== Contas Ordenadas por Tipo e Número ===");
		for (Map.Entry<TipoConta, List<Conta>> entry : contasAgrupadas.entrySet()) {
			System.out.println("\n\nTipo Conta: " + entry.getKey());
			for (Conta conta : entry.getValue()) {
				imprimirConta(conta);
			}
			System.out.println("---------------------------------");
		}
	}

	// Exbir contas corrente
	public void exibirContasCorrentesOrdenadas() {
		List<Conta> contasCorrentes = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta instanceof ContaCorrente) {
				contasCorrentes.add(conta);
			}
		}

		// Ordene as contas correntes por número de conta
		contasCorrentes.sort((c1, c2) -> {
			int comparacaoAgencia = Integer.compare(c1.getAgencia(), c2.getAgencia());
			if (comparacaoAgencia != 0) {
				return comparacaoAgencia;
			}
			return Integer.compare(c1.getNumero(), c2.getNumero());
		});

		// Imprima as contas correntes ordenadas
		System.out.println("=== Contas Correntes Ordenadas por Número ===");
		for (Conta conta : contasCorrentes) {
			imprimirConta(conta);
		}
		System.out.println("----------------------------------------");
	}

	// Exbir contas corrente
	public void exibirContasPoupancaOrdenadas() {
		List<Conta> contasPoupanca = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta instanceof ContaPoupanca) {
				contasPoupanca.add(conta);
			}
		}

		// Ordene as contas poupança por número de conta
		contasPoupanca.sort((c1, c2) -> {
			int comparacaoAgencia = Integer.compare(c1.getAgencia(), c2.getAgencia());
			if (comparacaoAgencia != 0) {
				return comparacaoAgencia;
			}
			return Integer.compare(c1.getNumero(), c2.getNumero());
		});

		// Imprima as contas poupança ordenadas
		System.out.println("=== Contas Poupança Ordenadas por Número ===");
		for (Conta conta : contasPoupanca) {
			imprimirConta(conta);
		}
		System.out.println("-------------------------------------------");
	}

}