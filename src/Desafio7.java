import java.text.NumberFormat;
import java.util.Locale;

public class Desafio7 {

	/**
	 * Sequencia de numeros
	 * Imprimir o valor de [1 50]
	 */
	public static void sequenciaDeNumeros() {
		int a = 50, impar = 0, par = 0;
		
		Locale br = new Locale("pt", "Brazil");
		NumberFormat nf = NumberFormat.getInstance(br);

		System.out.println("Sequencia de números");
		
		for (int i = 1; i <= a; i += 2) {
			impar += i;
		}
		
		for (int i = 0; i <= a; i += 2) {
			par += i;
		}
		
		double temp = par - impar;
		double temp2 = temp;

		while (temp > 1) {
			temp2 = temp2 * (temp - 1);
			temp--;
		}
		String fTemp2 = nf.format(temp2);
		System.out.println("[1 50]: " + fTemp2);
	}
}