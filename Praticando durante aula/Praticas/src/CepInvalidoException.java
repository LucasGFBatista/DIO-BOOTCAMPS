import java.util.Scanner;

public class CepInvalidoException extends Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Insira um cep");
			String cep = scan.next();

			String cepFormatado = formatarCep(cep);
			System.out.println(cepFormatado);

			scan.close();
		} catch (CepInvalidoException e) {
			System.out.println("O cep precisa ter 8 digitos");
		}

	}

	static String formatarCep(String cep) throws CepInvalidoException {
		if (cep.length() != 8)
			throw new CepInvalidoException();

		// Formatador de cep
		return cep.substring(0, 5) + "-" + cep.substring(5);
	}
}
