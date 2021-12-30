package lambdas;

public class Calculadora2 {
	public static void main(String[] args) {

		// Utilizando o modelo padrao de Lambda.

		Calculo calc = (x, y) -> {
			return x + y;
		};

		calc = (x, y) -> {
			return x * y;
		};

		System.out.println(calc.executar(4, 2));
	}
}
