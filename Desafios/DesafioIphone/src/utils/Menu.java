package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Contato;
import model.Musica;
import model.aparelhos.SmartPhone;

public class Menu {
	private Scanner scanner;
	private SmartPhone iphone;
	private int volumeMidia;

	public Menu() {
		scanner = new Scanner(System.in);
		iphone = new SmartPhone();
	}

	public void exibirMenu() {

		// Isso é muito legal e trabalhoso, utilizando essa ferramenta:
		// https://pt.rakko.tools/tools/68/
		System.out.println("  ####    #####    ##  ##    ####    ##  ##   ######  ");
		System.out.println("   ##     ##  ##   ##  ##   ##  ##   ### ##   ##      ");
		System.out.println("   ##     ##  ##   ##  ##   ##  ##   ######   ##      ");
		System.out.println("   ##     #####    ######   ##  ##   ######   ####    ");
		System.out.println("   ##     ##       ##  ##   ##  ##   ## ###   ##      ");
		System.out.println("   ##     ##       ##  ##   ##  ##   ##  ##   ##      ");
		System.out.println("  ####    ##       ##  ##    ####    ##  ##   ######  ");

		int opcao = 0;
		do {
			try {
				System.out.println("\n---- Escolha o aplicativo ----");
				System.out.println("1. Reprodutor musical");
				System.out.println("2. Aparelho telefônico");
				System.out.println("3. Navegador de internet");
				System.out.println("4. Encerrar aparelho");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					exibirMenuReprodutorMusical();
					break;
				case 2:
					exibirMenuAparelhoTelefonico();
					break;
				case 3:
					exibirMenuNavegadorInternet();
					break;
				case 4:
					System.out.println("Encerrando aparelho...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			} catch (InputMismatchException erro) {
				System.err.println("\nEntrada inválida. Insira apenas números inteiros. Tente novamente\n");
				scanner.nextLine(); 
			}
		} while (opcao != 4);
	}

	private void exibirMenuReprodutorMusical() {
		int opcao = -1;
		do {
			try {
				System.out.println("\n---- Reprodutor Musical ----");
				System.out.println("1. Tocar música");
				System.out.println("2. Pausar música");
				System.out.println("3. Selecionar música");
				System.out.println("4. Aumentar volume");
				System.out.println("5. Diminuir volume");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					iphone.tocar();
					break;
				case 2:
					iphone.pausar();
					break;
				case 3:
					System.out.print("Nome da música: ");
					String nomeMusica = scanner.nextLine();
					System.out.print("Nome da banda: ");
					String nomeBanda = scanner.nextLine();
					Musica musica = new Musica(nomeMusica, nomeBanda);
					iphone.selecionarMusica(musica);
					break;
				case 4:
					iphone.aumentarVolume(volumeMidia);
					break;
				case 5:
					iphone.diminuirVolume(volumeMidia);
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			} catch (InputMismatchException erro) {
				System.err.println("\nEntrada inválida. Insira apenas números inteiros. Tente novamente\n");
				scanner.nextLine(); // Limpa o buffer do scanner
			}
		} while (opcao < 1 || opcao > 5);
	}

	private void exibirMenuAparelhoTelefonico() {
		int opcao = -1;
		do {
			try {
				System.out.println("\n---- Aparelho Telefônico ----");
				System.out.println("1. Ligar para número");
				System.out.println("2. Ligar para contato");
				System.out.println("3. Atender");
				System.out.println("4. Viva voz");
				System.out.println("5. Iniciar correio de voz");
				System.out.println("6. Silenciar");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					System.out.print("Digite o número: ");
					String numero = scanner.nextLine();
					iphone.ligar(numero);
					break;
				case 2:
					System.out.print("Nome do contato: ");
					String nome = scanner.nextLine();
					System.out.print("Número do contato: ");
					String numeroContato = scanner.nextLine();
					Contato contato = new Contato(nome, numeroContato);
					iphone.ligar(contato);
					break;
				case 3:
					iphone.atender();
					break;
				case 4:
					iphone.vivaVoz();
					break;
				case 5:
					iphone.inciarCorreioVoz();
					break;
				case 6:
					iphone.silenciar();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			} catch (InputMismatchException erro) {
				System.err.println("\nEntrada inválida. Insira apenas números inteiros. Tente novamente\n");
				scanner.nextLine(); 
			}
		} while (opcao != 6);
	}

	private void exibirMenuNavegadorInternet() {
		int opcao = -1;
		do {
			try {
				System.out.println("\n---- Navegador de Internet ----");
				System.out.println("1. Exibir página");
				System.out.println("2. Adicionar nova aba");
				System.out.println("3. Fechar aba");
				System.out.println("4. Atualizar página");
				System.out.println("5. Fechar página");
				System.out.print("Escolha uma opção: ");
				opcao = scanner.nextInt();
				scanner.nextLine();

				switch (opcao) {
				case 1:
					iphone.exibirPagina();
					break;
				case 2:
					iphone.adicionarNovaAba();
					break;
				case 3:
					iphone.fecharAbaNavegador();
					break;
				case 4:
					iphone.atualizarPagina();
					break;
				case 5:
					iphone.fecharPagina();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
			} catch (InputMismatchException erro) {
				System.err.println("\nEntrada inválida. Insira apenas números inteiros. Tente novamente\n");
				scanner.nextLine(); 
			}
		} while (opcao != 5);
	}
}
