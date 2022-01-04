package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		//Predicate sempre retorna tipo booleano!
		Predicate<Produto> isCaro = produtos -> (produtos.preco *(1 - produtos.desconto))>= 1000;
		
		Produto produt = new Produto("Notebook", 1500.00, 0.10);
		System.out.println("Produto caro: " + isCaro.test(produt));
	}
}
