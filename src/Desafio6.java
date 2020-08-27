import java.util.Scanner;

public class Desafio6 {

	/**
	 * Maior palavra
	 * Mostrar a maior palavra
	 */
	public static void maiorPalavra() {
		Scanner scanner = new Scanner(System.in);
		int fMenor = 0, fMaior = 0;
		System.out.println("Digite a frase");
		String frase = scanner.nextLine();

		String quebra[] = frase.split(" ");

		for (int i = 0; i < quebra.length; i++) {
			if (quebra[i].length() < quebra[fMenor].length()) {
				fMenor = i;
			}
			if (quebra[i].length() > quebra[fMaior].length()) {
				fMaior = i;
			}

		}
		System.out.println("A maior palavra é: " + quebra[fMaior]);
		scanner.close();
	}
}
