package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		Predicate<Produto> registro = casa -> (casa.preco * (1-casa.desconto) > 20.0);
		
		Produto produto = new Produto("VetMax Pro", 30.00, 0.5);
		
		System.out.println(registro.test(produto));
	}
}
