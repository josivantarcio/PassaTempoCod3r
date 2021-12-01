package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, Usuario> registro = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("nome da Pessoa: ");
			registro.put(i, new Usuario(scan.next())); //[.put] -> faz o papel do add, porem, ele mode alterar um valor existente
		}
		
		System.out.println(registro);
		System.out.println(registro.size()); //tamanho
		System.out.println(registro.isEmpty() ? "Verdade": "Falso"); //verifica se está vazio.
		
		System.out.println(registro.keySet()); //busca pela chave
		System.out.println(registro.values()); // busca pelo valor
		System.out.println(registro.entrySet()); // busca pela chave e valor
		
		System.out.println(registro.containsKey(2) ? "YES" : "NO"); //consulta se a chave em paramento consta 
		System.out.println(registro.containsValue(new Usuario("Pedro")) ? "Ok" : "No-OK"); // consulta se o valor em paramento consta
		
		System.out.println(registro.get(3)); // retorna o valor pela chave
		
		/**
		 * ## Pecorrer no conjunto
		 * [.ketSet] -> pecorrer pelas chaves
		 */
		for(int chave : registro.keySet()) { 
			System.out.println(chave);
		}
		
		/**
		 * .valuesw() -> pecorrer pelos valores
		 */
		for(Usuario nomes : registro.values()) { 
			System.out.println(nomes);
		}
		
		/**
		 * [Entry< , >] --> É especifico para pecorrer valores e chaves ao mesmo tempo
		 * [getKey] --> pega as chaves 
		 * [getValue] --> pega os valores
		 */
		for(Entry<Integer, Usuario> reg : registro.entrySet()) { 
			System.out.println(reg.getKey()+" >> "+reg.getValue()); 		
		}
		
		/**
		 * .remove(k) --> remove o registro pela chave (k)
		 * .remove(k, v) --> remove o registro pela chave e valor. Caso nao atenda os requisitos, a operação é cancelada.
		 */
		System.out.println(registro.remove(1));
		System.out.println(registro.remove(2, new Usuario("pedro")));
		System.out.println(registro);
		
	}
}
