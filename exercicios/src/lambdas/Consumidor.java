package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> ler = p -> System.out.println(p);

		Produto produto1 = new Produto("Cafe", 5.00, 0.50);
		Produto produto2 = new Produto("Acucar", 5.20, 0.20);
		Produto produto3 = new Produto("Farinha", 1.50, 0.25);
		Produto produto4 = new Produto("Arroz", 2.70, 0.15);
		Produto produto5 = new Produto("Feijao", 7.00, 0.10);

		// produto.accept(produto1);

		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
		produtos.forEach(ler);

	}
}
