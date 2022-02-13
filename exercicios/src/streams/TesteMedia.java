package streams;

import java.util.Locale;

public class TesteMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Media m = new Media()
				.adicionar(8)
				.adicionar(9)
				.adicionar(7)
				.adicionar(8);
		
		Media m2 = new Media();
		m2.adicionar(9);
		m2.adicionar(5);
		
		System.out.println(m.getValor());
		System.out.println(m2.getValor());
		
		System.out.printf("%.2f", Media.combinar(m, m2).getValor());

	}
}
