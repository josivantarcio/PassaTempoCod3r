package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::println;

		Stream<String> familia = Stream.of("Josevan", "Branca", "Bruno", "Rebeca");
		familia.forEach(print);

		String[] parentes1 = { "Jose Maria", "Vania", "Joseanne", "Terla", "Pedro" };
		// Stream.of(parentes1).forEach(print);
		// Arrays.stream(parentes1).forEach(print);
		Arrays.stream(parentes1, 0, parentes1.length).forEach(print);

		List<String> parentes2 = Arrays.asList("Jordanio", "Adriana", "Alicia");
		parentes2.stream().forEach(print);
		parentes2.parallelStream().forEach(print);
	}
}
