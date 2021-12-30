package lambdas;

public class Calculadora3 {
	public static void main(String[] args) {
		
		//Utilizando o modelo reduzido de Lambda.
		
		Calculo calc = (x,z) -> x + z;
		double a = calc.executar(4, 2);
		
		Calculo c = (q,w) -> {
			return 5 * 7;
		};
		
		System.out.println(calc.segundoCalculo());
		
		System.out.println(a);
		
		System.out.println(c.segundoCalculo());
		System.out.println(c.legal());
		System.out.println(Calculo.legalDemais());
	}
}
