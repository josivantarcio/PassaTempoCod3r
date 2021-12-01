package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrdenado {
	public static void main(String[] args) {
		Set <String> lista = new TreeSet<>();
		
		lista.add("Pedro");
		lista.add("Ana");
		lista.add("Lucas");
		lista.add("Ilton");
		
		
		System.out.println(lista);
		for(String n : lista) {
			System.out.print(n+" ");
		}
		
		
		
	}
}
