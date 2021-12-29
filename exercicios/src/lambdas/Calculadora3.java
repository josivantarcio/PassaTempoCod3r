package lambdas;

public class Calculadora3 {
	public static void main(String[] args) {
		
		//Utilizando o modelo reduzido de Lambda.
		
		Calculo calc = (x,z) -> x, z;
		double a = calc.executar(4, 3);
		
		System.out.println(a);
	}
}
