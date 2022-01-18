package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("Cama", 3235.89, 0.13);

		BinaryOperator<Double> precoFinal = (preco, desconto) -> preco * (1 - desconto);

		Function<Double, Double> impostoMunicipal = preco -> preco >= 2500 ? (preco * 1.085) : preco;

		Function<Double, Double> frete = preco -> preco >= 3000 ? (preco + 100.0) : (preco + 50.0);

		double precoFormatado = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.apply(produto.preco,produto.desconto);
		System.out.printf("R$%.2f", precoFormatado);
	}
}
