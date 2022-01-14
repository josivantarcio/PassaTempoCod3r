package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isNumeroCom3Digitos = num -> num >= 100 && num <= 999;
		
		int num = 1000;
		
		boolean resultado = isPar.or(isNumeroCom3Digitos).negate().test(num);
		boolean resultado2 = isNumeroCom3Digitos.and(isPar).test(num);

		System.out.println(resultado);
		System.out.println(resultado2);
		
	}
}
