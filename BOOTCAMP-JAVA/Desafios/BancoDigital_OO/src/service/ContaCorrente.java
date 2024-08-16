package service;

import model.Cliente;
import model.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.tipoConta = tipoConta.CORRENTE;
	}

}