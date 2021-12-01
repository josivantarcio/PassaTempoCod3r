package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		/**
		 * add e offer -> adicionam elementos na fila.
		 * A diferença é o comportamento quando a fila está cheia.
		 */
		fila.add("Ana"); // retorna false
		fila.offer("Marisa"); //lança uma exceção
		fila.add("Joca");
		fila.offer("Silvio");
		fila.add("Antonia");
		fila.offer("Costa");
		
		
		/**
		 * peek e element -> obter o proximo da elemento da fila (sem remover).
		 * A diferença é o comportamento ocorre quando a fila está vazia. 
		 */
		System.out.println(fila); // se a fila estiver vazia, retorna vazio.
		System.out.println(fila.peek()); // se a fila estiver vazia, retorna null.
		System.out.println(fila.element()); // se a fila estiver vazia, lança uma exceção. 

			
		/**
		 * poll e remove -> obter o proximo da elemento da fila (remove).
		 * A diferença é o comportamento ocorre quando a fila está vazia. 
		 */
		System.out.println(fila.poll()); //retorna null
		System.out.println(fila.remove()); //lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		fila.size(); //tamanho da fila.
		fila.clear(); //limpár a fila.
		fila.isEmpty(); //saber se a fila esta vazia.
		fila.contains(fila); //saber se o elemento está na fila.
		
		
	}
}
