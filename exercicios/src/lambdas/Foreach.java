package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Paula", "Sonia", "Carla", "Joana");

		System.out.println("Forma tradicional");
		for (String nomes : aprovados) {
			System.out.println(nomes);
		}

		System.out.println("\nLambda #1");
		aprovados.forEach(nome -> System.out.println(nome + ";"));
		
		System.out.println("\nMethod Reference #1");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #2");
		aprovados.forEach(nome -> imprimir(nome));
		
		System.out.println("\nMethod Reference #2");
		aprovados.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println(nome + "!");
	}
}
