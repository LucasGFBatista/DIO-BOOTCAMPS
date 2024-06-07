package service;

import model.Cliente;
import model.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.tipoConta = tipoConta.CORRENTE;
	}

//	@Override
//	public void imprimirExtrato() {
//		System.out.println("=== Extrato Conta Corrente ===");
//		System.out.println(String.format("Titular: %s", super.getTipoConta().getNomeTipo()));
//		super.imprimirInfosComuns();
//	}

}