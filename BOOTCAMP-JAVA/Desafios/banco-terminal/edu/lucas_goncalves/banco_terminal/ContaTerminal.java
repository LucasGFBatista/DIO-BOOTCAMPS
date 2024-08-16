package edu.lucas_goncalves.banco_terminal;

public class ContaTerminal {

	private String agencia;
	private int numeroConta;
	private String nomeCliente;
	private double saldo;

	// Construtores
	public int getNumeroConta() {
		return numeroConta;
	}

	public ContaTerminal(String agencia, int numeroConta, String nomeCliente, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;

		// Getters e Setters

	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Metodo para imprimir mensagem de boas vindas
	public String bemVindo() {
		return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
				+ "conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";
	}
}
