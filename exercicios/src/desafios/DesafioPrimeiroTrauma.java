package desafios;

public class DesafioPrimeiroTrauma {

	int a = 3; //Não pode mexer aqui!
	//or
	static int g = 5;
	
	public static void main(String[] args) {
	
		/**
		 * Só pode ter acesso a variavel fora do metodo static, se for instanciado primeiro.
		 */
		DesafioPrimeiroTrauma b = new DesafioPrimeiroTrauma();  
		System.out.println(b.a);
		
		/**
		 * se a variavel for static, tem acesso liberado a metodos static sem necessidade de instanciar o objeto.
		 */
		System.out.println(g);
	}
}
