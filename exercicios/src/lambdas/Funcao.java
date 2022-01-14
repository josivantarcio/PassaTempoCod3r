package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> numeroPar = num -> num % 2 == 0 ? "Par" : "Impar";
		Function<String, String> mensagem = msn -> "O número é: " + msn;
		Function<String, String> show = sw -> sw + " !!!";

		System.out.println(numeroPar.andThen(mensagem).andThen(show).apply(22));
	}
}
