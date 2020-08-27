import java.util.Scanner;

public class Desafio3 {

	/**
	 * Manipulando texto I
	 * Mostrar a quantidade de A existente
	 */
	
	public static void buscaLetra() {
		int quantidade = 0;
		String frase;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a Frase: ");
		frase = scanner.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a') {
				quantidade = quantidade + 1;
			}
		}
		System.out.println("Quantidade de letras A = " + quantidade);
		scanner.close();
	}
}
