package model;

import model.exception.TransacaoValorInvalidoException;

public interface IConta {

	void sacar (double valor) throws TransacaoValorInvalidoException;
	void depositar(double valor) throws TransacaoValorInvalidoException;
	void transferir(double valor, Conta contaDestino) throws TransacaoValorInvalidoException;
	void imprimirExtrato();
	
}