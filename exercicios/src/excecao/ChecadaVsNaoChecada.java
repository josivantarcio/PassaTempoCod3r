package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			e.getMessage();
		}

		
		
		System.out.println("Fim :)");
	}

	//Exceção NÃO verificada
	public static void geraErro1() {
		throw new RuntimeException("Erro 1 : Esse erro foi gerado geraErro1()");
	}

	
	//Exceção verificada
	public static void geraErro2() throws Exception {
		throw new Exception("Erro 2 : Esse erro foi gerado geraErro2()");
	}

}
