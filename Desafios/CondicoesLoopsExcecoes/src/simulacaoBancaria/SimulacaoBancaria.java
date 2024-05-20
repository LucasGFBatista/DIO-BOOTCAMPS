package simulacaoBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

//Fiz pela IDE eclipse e depois colei, ficou mais facil por lá para fazer os testes

public class SimulacaoBancaria {

	private static Scanner scanner = new Scanner(System.in);
	private static double saldo = 0;

	public static void main(String[] args) {

		while (true) {

			int opcao = 0;
			try {
				opcao = scanner.nextInt();
			} catch (InputMismatchException erro) {
				System.err.println("Opção inválida. Digite um número entre 1 e 4.");
				scanner.next();
				return;
			}

			switch (opcao) {
			case 1:
				Depositar();
				break;
			case 2:
				Sacar();
				break;
			case 3:
				ConsultarSaldo();
				break;
			case 4:
				System.out.println("Programa encerrado.");
				System.exit(0);
				break;
			default:
				System.out.println("Programa encerrado.");
				System.exit(0);
				break;
			}
		}
	}

	private static void Depositar() {

		try {
			double valorDepositado = scanner.nextDouble();
			if (valorDepositado < 0) {

			} else {
				saldo += valorDepositado;
				System.out.println("Saldo atual: " + saldo);
			}
		} catch (InputMismatchException erro) {
			System.err.println("O valor deve ser decimal ou inteiro.");
			scanner.next();
		}
	}

	private static void Sacar() {

		try {
			double valorSacado = scanner.nextDouble();
			if (valorSacado < 0) {
				System.err.println("O valor deve ser positivo.");
			} else if (valorSacado > saldo) {
				System.out.println("Saldo insuficiente.");
			} else {
				saldo -= valorSacado;
				System.out.println("Saldo atual: " + saldo);

			}
		} catch (InputMismatchException erro) {
			System.err.println("O valor deve ser decimal ou inteiro.");
			scanner.next();
		}
	}

	private static void ConsultarSaldo() {
		System.out.println("Saldo atual: " + saldo);
	}
}
