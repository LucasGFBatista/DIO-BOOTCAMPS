package service;

import model.Cliente;
import model.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.tipoConta = tipoConta.POUPANCA;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println(String.format("Titular: %s", super.getTipoConta().getNomeTipo()));
		super.imprimirInfosComuns();
	}
}