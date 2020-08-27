import java.util.Scanner;

public class Desafio4 {

	/**
	 * Manitupando testo II
	 * Mostrar o numero de palavras
	 */
	public static void buscaPalavras() {
		int quantidade = 1;
		String frase;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a Frase: ");
		frase = scanner.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				if (frase.charAt(i + 1) != ' ') {

					quantidade = quantidade + 1;
				}
			}
		}
		System.out.println("Quantidade de palavras = " + quantidade);
		scanner.close();
	}
}
