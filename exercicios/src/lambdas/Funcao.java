package lambdas;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> numeroPar = num -> num % 2 == 0 ? "Par" : "Impar";
		Function<String, String> mensagem = msn -> "O número é: " + msn;
		Function<String, String> show = sw -> sw + " !!!";
		Function<String, String> duvida = dv -> dv + " ???";
		
		String mensagem1 = numeroPar
				.andThen(mensagem)
				.andThen(show)
				.apply(25);
		System.out.println(mensagem1);
		
		String mensagem2 = numeroPar
				.andThen(mensagem)
				.andThen(duvida) 
				.apply(22);
		System.out.println(mensagem2);
	}
}
