package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> registro = casa -> (casa.preco >= 30.00);
		
		Produto produto = new Produto("VetMax Pro", 30.00, 0.5);
		
		System.out.println(registro.test(produto));
		
		if(registro.test(produto)) {
			System.out.println("É Caro");
		}else {
			System.out.println("Não é caro");
		}
	}
}
