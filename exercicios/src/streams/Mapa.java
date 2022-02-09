package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapa {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("Volvo ", "Toyota ", "Jeep ", "BMW\n");
		
		//ex1:
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		
		//ex2:
		marcas.stream()
			.map(Mapeamento.maiusculo)
			.forEach(print);
		
		marcas.stream()
			.map(Mapeamento.maiusculo)
			.map(Mapeamento.primeiraLetra)
			.map(Mapeamento.grito)
			.forEach(print);
			
	}
}
