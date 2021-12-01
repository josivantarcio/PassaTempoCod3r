package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> nomes = new ArrayList<>();

		Usuario u2 = new Usuario("Pedro");
		nomes.add(u2);
		
		nomes.add(new Usuario("Jose"));
		
		
		nomes.add(new Usuario("Francisco"));
		nomes.add(new Usuario("Antonio"));
		nomes.add(new Usuario("Norma"));
		nomes.add(new Usuario("Talles"));
		nomes.add(new Usuario("Norma"));
		
		System.out.println(nomes);
		
		//nomes.remove(u2);
		nomes.set(1, new Usuario("Carla"));

		System.out.println(nomes.remove(new Usuario("Talles")));
		System.out.println(nomes.remove(new Usuario("Talles")));
		System.out.println(nomes.get(2).nome);
		System.out.println(nomes.size());
		System.out.println(nomes);
	}
}
