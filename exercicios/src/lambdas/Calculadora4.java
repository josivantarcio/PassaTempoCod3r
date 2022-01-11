package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Calculadora4 {
	public static void main(String[] args) {

		// Utilizando o modelo reduzido de Lambda.
		
		BinaryOperator<Double> calc = (x, z) -> x / z; //BinaryOperator -> recebe dois parametros e não retorna nada.
		double a = calc.apply(4.0, 2.0);
		System.out.println(a);

		Consumer<Produto> imprimirLista = p -> System.out.println(p); //Consumer -> recebe um parametro e retorna um.
		Produto produto = new Produto("Caminhao", 300000.00, 0.10);
		imprimirLista.accept(produto);

		List<String> listLoja = Arrays.asList("Americanas", "Bahia", "Freitas", "Lupo");
		listLoja.forEach(System.out::println);

		double valorCaminhao = produto.preco;
		Predicate<Produto> listProdutos = p -> (p.preco > valorCaminhao); //Predicate -> recebe um parametro e retorna Boolean  
		if (listProdutos.test(produto)) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

	}
}
