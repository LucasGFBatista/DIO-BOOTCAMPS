package edu.lucas_goncalves.banco_terminal;

import java.util.Scanner;

public class TerminalBanco {
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		// Declaração de variáveis para o objeto da classe ContaTerminal
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Bem vindo ao banco DIO");

		System.out.println("Por favor, insira seu nome:");
		nomeCliente = scan.next();

		System.out.println("Por favor, digite o número da Agencia:");
		agencia = scan.next();

		System.out.println("Por favor, digite o número da Conta:");
		numeroConta = scan.nextInt();

		System.out.println("Por favor, digite o valor para seu depósito inicial:");
		saldo = scan.nextDouble();

		// Fechar o scanner 
		scan.close();

		// Criar uma instância da classe ContaTerminal
		ContaTerminal conta = new ContaTerminal(agencia, numeroConta, nomeCliente, saldo);
		System.out.println(conta.bemVindo());
	}
}
