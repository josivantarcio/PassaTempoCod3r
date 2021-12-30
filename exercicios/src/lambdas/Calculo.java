package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a,double b);
	
	default String legal() {
		return "Olá Mundo!";
	}
	
	default double segundoCalculo() {
		double x = executar(2, 6);
		return x;
	}
	
	static String legalDemais() {
		return "show";
	}
	
}
