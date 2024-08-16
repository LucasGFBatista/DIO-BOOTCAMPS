package service;

import model.Cliente;
import model.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.tipoConta = tipoConta.POUPANCA;
	}

}