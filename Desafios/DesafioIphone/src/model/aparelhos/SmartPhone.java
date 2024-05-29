package model.aparelhos;

import java.util.Random;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import model.Contato;
import model.Musica;

public class SmartPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

	// Irei usar este objeto em dois metodos desta classe
	Random random = new Random();

	// Para trabalhar com volume do reprodutor musical
	private int volume = 50;
	private static int VOLUME_MAXIMO = 100;
	private static int VOLUME_MINIMO = 0;

	// metodos herdados de Interface @AparelhoTelefonico

	@Override
	public boolean redeMovelDisponivel() {

		return random.nextInt(3) == 0;
	}

	@Override
	public void ligar(String numero) {
		if (redeMovelDisponivel()) {
			System.out.println("Ligando para " + numero);
		} else {
			System.out.println("Sem sinal.");
		}

	}

	@Override
	public void ligar(Contato contato) {
		if (redeMovelDisponivel()) {
			System.out.println("Ligando para " + contato.getNome() + " (" + contato.getNumero() + ")");
		} else {
			System.out.println("Sem sinal.");
		}

	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");

	}

	@Override
	public void vivaVoz() {
		System.out.println("Ligando viva voz...");

	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("Silenciando chamada...");

	}

	@Override
	public void silenciar() {
		// TODO Auto-generated method stub

	}

	// Metodos herdados de @ReprodutorMusical

	@Override
	public void tocar() {
		System.out.println("Tocando música...");

	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");

	}

	@Override
	public void selecionarMusica(Musica musica) {
		System.out.println("Selecionando música: " + musica.getNome() + " da banda " + musica.getNomeArtista());

	}

	@Override
	public void aumentarVolume(int volume) {
		if (volume < VOLUME_MAXIMO) {
			volume++;
			System.out.println("Aumentando volume: " + volume);
		} else {
			System.out.println("Volume já está no máximo.");
		}

	}

	@Override
	public void diminuirVolume(int volume) {
		if (volume > VOLUME_MINIMO) {
			volume--;
			System.out.println("Diminuindo volume: " + volume);
		} else {
			System.out.println("Volume já está no mínimo.");
		}

	}

	// Metodos herdados de @NavegadorInternet

	@Override
	public boolean conexaoComInternet() {
		// TODO Auto-generated method stub
		return random.nextInt(3) == 0;
	}

	@Override
	public void exibirPagina() {

		if (conexaoComInternet()) {

			System.out.println("Exibindo página...");
		} else {
			System.out.println("Sem conexão com internet...");

		}

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");

	}

	@Override
	public void fecharAbaNavegador() {
		System.out.println("Fechando aba do navegador...");

	}

	@Override
	public void atualizarPagina() {
		if (conexaoComInternet()) {
			System.out.println("Atualizando página...");
		} else {
			System.out.println("Sem conexão com a internet.");
		}

	}

	@Override
	public void fecharPagina() {
		System.out.println("Fechando página...");

	}

}
