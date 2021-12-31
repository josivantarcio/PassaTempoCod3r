package lambdas;

import java.util.function.BinaryOperator;

public class Calculadora4 {
	public static void main(String[] args) {
		
		//Utilizando o modelo reduzido de Lambda.
		
		BinaryOperator<Double> calc = (x,z) -> x / z;
		double a = calc.apply(4.0, 2.0);
		
		Calculo c = (q,w) -> {
			return 5 * 7;
		};
		System.out.println(a);
	}
}
