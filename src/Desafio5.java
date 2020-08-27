import java.util.Scanner;

public class Desafio5 {

	/**
	 * Serie de Fibonacci
	 */
	public static void fibonacci() {
		int numero1 = 1, numero2 = 0 , serie;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da serie de Fibonacci: ");
		serie = scanner.nextInt();
		System.out.print(numero1 + " ");
		for (int i = 1; i < serie; i++) {
			numero1 = numero1 + numero2;
			numero2 = numero1 - numero2;
			System.out.print(numero1 + " ");
		}
		scanner.close();
	}
}
