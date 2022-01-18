package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {
	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 3000.00, 0.10);
		Function<Produto, Double> preco = p -> (p.preco - (1 - p.desconto));
		UnaryOperator<Double> imposto = p -> p >= 3000 ? p * 1.085 : p;
		UnaryOperator<Double> frete = p -> p >= 3000 ? (p + 100) : (p + 50);
		Function<Double, String> duasCasas = p -> String.format("R$%.2f", p);
		UnaryOperator<String> formatar = p -> p.replace(",", ".");

		String precoFinal = preco
				.andThen(imposto)
				.andThen(frete)
				.andThen(duasCasas)
				.andThen(formatar)
				.apply(produto);
		
		System.out.println(precoFinal);
	}
}
