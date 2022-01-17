package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
		
		//Faz o calculo da esquerda para direita
		Integer numero = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(numero);
		
		//Faz o calculo fim para o inicio
		int numero2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(1);
		System.out.println(numero2);
	}
}
