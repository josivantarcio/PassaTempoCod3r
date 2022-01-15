package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> Cores = () -> Arrays.asList("Amarelo","Azul","Vermelho");
		System.out.println(Cores.get());
	}
}
