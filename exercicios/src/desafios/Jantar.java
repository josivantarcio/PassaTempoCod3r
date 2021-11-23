package desafios;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Antonio",99.80);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.peso);
		
		Comida prato1 = new Comida("feijao", 0.180);
		Comida prato2 = new Comida("arroz", 0.300);
		
		pessoa.Comer(prato1);
		pessoa.Comer(prato2);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.peso);
	}
}
