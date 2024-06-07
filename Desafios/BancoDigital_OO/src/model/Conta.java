package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.exception.TransacaoValorInvalidoException;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected TipoConta tipoConta;
	protected Cliente cliente;
	private List<String> extrato;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.extrato = new ArrayList<>();

	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	@Override
	public void sacar(double valor) throws TransacaoValorInvalidoException {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			registrarTransacao("SAQUE - R$", valor);
		} else {
			if (valor <= 0) {
				throw new TransacaoValorInvalidoException("Valor de saque inválido. O valor deve ser maior que zero.");
			} else {
				System.out.println("Saldo insuficiente para saque de R$" + valor);
			}
		}
	}

	@Override
	public void depositar(double valor) throws TransacaoValorInvalidoException {
		if (valor > 0) {
			saldo += valor;
			registrarTransacao("DEPOSITO - R$", valor);
		} else {
			throw new TransacaoValorInvalidoException("Valor de deposito inválido. O valor deve ser maior que zero.");
		}

	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws TransacaoValorInvalidoException {
		if (valor > 0 && saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			registrarTransacao("TRANSFERENCIA - R$", valor);
		} else {
			if (valor <= 0) {
				throw new TransacaoValorInvalidoException(
						"Valor de transferencia inválido. O valor deve ser maior que zero.");
			} else {
				System.out.println("Saldo insuficiente para saque de R$" + valor);
			}

		}

	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	private void registrarTransacao(String tipoTransacao, double valor) {
		LocalDateTime dataHora = LocalDateTime.now();
		extrato.add(dataHora + " - " + tipoTransacao + valor);
	}
	
	public void imprimirExtrato() {
		
	}

}