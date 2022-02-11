package streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Mapeamento {

	public static final UnaryOperator<String> maiusculo = m -> m.toUpperCase();
	
	public static final UnaryOperator<String> primeiraLetra = pl -> "" + pl.charAt(0);
	
	public static final UnaryOperator<String> grito = g -> g + "!!! ";
	
	public final static Consumer<Object> print = System.out::println;
	
	public final static Predicate<Aluno> nota = n -> (n.getValue() > 7);
	
	public final static Function<Aluno, String> congratulation = a -> ("Congratulation " + a.getName() + ", you passed!");
}
