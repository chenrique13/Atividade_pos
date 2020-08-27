import java.util.Scanner;

public class Desafio8 {

	/**
	 * Formula de Bhaskara
	 * Imprimir valores
	 */
	public static void bhaskara() {
		double a, b, c, delta, x1, x2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a = scanner.nextInt();
		System.out.println("Digite o valor de B: ");
		b = scanner.nextInt();
		System.out.println("Digite o valor de C: ");
		c = scanner.nextInt();
		System.out.println("Equacao: (" + a + "x²) + (" + b + "x) + (" + c + ")");

		if (a == 0) {
			System.out.println("A = 0, nao forma uma equacao de segundo grau");
		} else {
			delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Nao existe raiz real ");
			} else if (delta == 0) {
				System.out.println("Existe uma raiz real");
				x1 = (-b) / (2 * a);
				String x1Format = String.valueOf(x1);
				if (x1Format.contains("0.5")) {
					x1Format = "1/2";
					System.out.println("Raiz = " + x1Format);
				}
				System.out.println("Raiz = "+x1);
			} else {
				System.out.println("Existem duas raizes reais");
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Primeira raiz = " + x1);
				System.out.println("Segunda raiz = " + x2);
			}
		}
		scanner.close();
	}
}
