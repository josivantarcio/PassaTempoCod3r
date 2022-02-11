package desafios.d3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Convert {
	//imprimir na tela
	public final static Consumer<Integer> print = System.out::println;
	
	//Converter de Inteiro para Binario
	public final static Function<Integer, String> convertBinario = i -> Integer.toBinaryString(i);

	//Inverter a posição da String
	public final static UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

	//Converter para Inteiro a String
	public final static Function<String, Integer> reverter = s -> Integer.parseInt(s, 2);
}
