package exercicios;

import java.util.Arrays;
import java.util.List;

public class Teste3 {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Josevan","Branca","Bruno","Rebeca");
		
		for(String nm : nomes) {
			System.out.println(nm);
		}
		
		System.out.println();
		nomes.forEach(nome -> System.out.println(nome));
		
		System.out.println();
		nomes.forEach(System.out::println);
		
		System.out.println();
		nomes.forEach(nome -> Imprimir.imprimirTexto(nome));
		
		System.out.println();
		nomes.forEach(Imprimir::imprimirTexto);
		
	}
}
