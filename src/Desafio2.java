import java.util.Scanner;

public class Desafio2 {

	/**
	 * Sequencia I
	 * Mostrar o Valor de A
	 */
	public static void sequencia1() {	
		double a = 0, equacao = 0, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de N: ");
		n = scanner.nextDouble();
		for (int i = 1; i <= n; i++) {
			equacao = equacao + ((n - i) / (i + 1));
		}
		a = n + equacao;
		System.out.println("A = " + a);
		scanner.close();
	}
}
