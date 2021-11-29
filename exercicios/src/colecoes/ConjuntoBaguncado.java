package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		/**
		 * => Uma coleção não suporta tipos primitivos. A IDE converte automaticamente para Classe.
		 * => Não pode ter valores repetidos
		 */
		
		//adicionar .add()
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add('x'); // char -> Character
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		
		System.out.println(conjunto.size());
		
		conjunto.add("teste");
		System.out.println(conjunto.size());
		
		
		//remover .remove()
		conjunto.remove('x');
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.size());
		
		
		//conter no conjunto .contains() @return boolean
		System.out.println(conjunto.contains(1));
		
		System.out.println(conjunto+ " == tamanho: " + conjunto.size());
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums+ " == tamanho: " + nums.size());
		
		
		//Uniao entre dois conjuntos .addAll()
	//	conjunto.addAll(nums);
		System.out.println(nums+ " == tamanho: " + nums.size());
		System.out.println(conjunto+ " == tamanho: " + conjunto.size());
		
		//Intercessao entre dois conjuntos .retainAll()
		conjunto.retainAll(nums);
		
		System.out.println(nums+ " == tamanho: " + nums.size());
		System.out.println(conjunto+ " == tamanho: " + conjunto.size());
	}
}
