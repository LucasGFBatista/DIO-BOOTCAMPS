package desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean parametrosValidos = false;

		while (!parametrosValidos) {
			try {

				System.out.println("Digite o primeiro parâmetro");
				int parametroUm = scan.nextInt();
				System.out.println("Digite o segundo parâmetro");
				int parametroDois = scan.nextInt();

				contar(parametroUm, parametroDois);
				parametrosValidos = true;

			} catch (ParametrosInvalidosException exception) {

				System.err.println("\nO segundo parametro deve ser diferente e maior que o primeiro. Tente novamente\n");

			} catch (InputMismatchException erro) {

				System.err.println("\nEntrada inválida. Insira apenas numeros inteiros. Tente novamente\n");

				scan.next();
			}
		}

		scan.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if (parametroDois <= parametroUm)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		System.out.println("\n\nA contagem será até: " + contagem);
		for (int i = 0; i <= contagem; i++) {
			System.out.println(i);

		}
	}
}