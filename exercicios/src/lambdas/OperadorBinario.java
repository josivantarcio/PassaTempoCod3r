package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(8.5, 5.9));
		
		BiFunction<Double, Double, String> resultadoFinal = 
				(n1, n2) -> ((n1+n2) / 2) >= 7.0 ? "Aprovado" : "Reprovado";
				String resultado = resultadoFinal.apply(8.5, 5.9);
		System.out.println(resultado);
		
		Function<Double, String> calculaResultado = m -> m > 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(calculaResultado).apply(8.5, 4.8));
	}
}
