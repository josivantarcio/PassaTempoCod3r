package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("A Biblia");
		livros.add("Ponto Cego");
		livros.push("A Italia");
		livros.push("A cruz e a Espada");
		livros.offer("Mochileiro");
		
		for(String livro : livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros);
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros);
		
		
	}
}
