package oo.polimofismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa cliente1 = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(0.100);
		
		Comida ingrediente3 = new Arroz(0.300);
		
		System.out.println(cliente1.getPeso());
		
		cliente1.comer(ingrediente1);
		cliente1.comer(ingrediente2);
		cliente1.comer(ingrediente3);
		
		
		
		System.out.println(cliente1.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.400);
		cliente1.comer(sobremesa);
		
		System.out.printf("%.2f", cliente1.getPeso());
				
	}
}
