package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Calculadora4 {
	public static void main(String[] args) {
		
		//Utilizando o modelo reduzido de Lambda.
		
		BinaryOperator<Double> calc = (x,z) -> x / z;
		double a = calc.apply(4.0, 2.0);
		
		System.out.println(a);
	}
}
