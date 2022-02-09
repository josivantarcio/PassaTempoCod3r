package streams;

import java.util.function.UnaryOperator;

public class Mapeamento {

	public static final UnaryOperator<String> maiusculo = m -> m.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = pl -> "" + pl.charAt(0);
	public static final UnaryOperator<String> grito = g -> g + "!!! ";
}
