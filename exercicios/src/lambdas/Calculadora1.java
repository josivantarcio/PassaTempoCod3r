package lambdas;

public class Calculadora1 {
	public static void main(String[] args) {
		
		// Modelo com instancia.
		
		Calculo s = new Somar();
		System.out.println(s.executar(4, 2));

		s = new Multiplicacao();
		System.out.println(s.executar(4, 2));
	}
}
