package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Chico","Paulo","Jose","Pedro","Joao");
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEachOrdered(System.out::println);
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());			
		}

		System.out.println("\nForEach...");
		for(String registro:aprovados) {
			System.out.println(registro);
		}
	}
}
