package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> nomes = new HashSet<>();
		
		nomes.add(new Usuario("Pedro"));
		nomes.add(new Usuario("Ana"));
		nomes.add(new Usuario("Guilherme"));
		
		System.out.println(nomes.contains(new Usuario("Pedro")));
	}
}
