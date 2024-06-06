package model;

import java.util.ArrayList;

import java.util.List;

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

	//Conta poupança
	public void criarContaPoupanca(Cliente cliente) {
		contas.add(new ContaPoupanca(cliente));
	}

}