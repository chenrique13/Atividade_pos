import java.text.NumberFormat;
import java.util.Locale;

public class Desafio1 {

	/**
	 * Desafio da Rainha e o Monge
	 * Mostrar as casas, a quantidade de graos e a soma acumulada
	 */
	public static void rainhaMonge() {
		double soma = 1, qnt = 1;
		Locale br = new Locale("pt", "Brazil");
		NumberFormat nf = NumberFormat.getInstance(br);
		for (int casa = 1; casa <= 64; casa++) {
			String sQnt = nf.format(qnt);
			String sSoma = nf.format(soma);
			System.out.println("Casa: " + casa + " - Quantidade: " + sQnt + " - Soma: " + sSoma);
			qnt = qnt * 2;
			soma = soma + qnt;
		}
	}
}
