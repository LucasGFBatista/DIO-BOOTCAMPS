package app;

import model.Cliente;
import model.Conta;
import model.exception.TransacaoValorInvalidoException;
import model.Banco;
import service.ContaCorrente;
import service.ContaPoupanca;

public class Main {

	public static void main(String[] args) throws TransacaoValorInvalidoException {
		// Criar clientes
		Cliente cliente1 = new Cliente("João Silva", "12345678900");
		Cliente cliente2 = new Cliente("Maria Oliveira", "98765432100");
		Cliente cliente3 = new Cliente("Pedro Souza", "00012345678");

		// Criar um banco
		Banco banco = new Banco("Banco do Povo");

		// Criar contas e adicionar ao banco
		Conta contaCorrente1 = new ContaCorrente(cliente1);
		contaCorrente1.depositar(1000.00);
		banco.criarContaCorrente(cliente1);

		Conta contaPoupanca2 = new ContaPoupanca(cliente2);
		contaPoupanca2.depositar(500.00);
		banco.criarContaPoupanca(cliente2);

		Conta contaCorrente3 = new ContaCorrente(cliente3);
		contaCorrente3.depositar(2000.00);
		banco.criarContaCorrente(cliente3);

		// Exibir todas as contas ordenadas

		contaCorrente1.depositar(550);
		contaCorrente1.depositar(550);
		contaCorrente1.transferir(300.80, contaCorrente3);

		contaCorrente1.depositar(550);
		contaCorrente1.depositar(550);

		contaCorrente1.imprimirExtrato();

		banco.exibirTodasContasOrdenadas();

		// Exibir apenas contas correntes ordenadas
		banco.exibirContasCorrentesOrdenadas();

		// Exibir apenas contas poupança ordenadas
		banco.exibirContasPoupancaOrdenadas();
	}
}
