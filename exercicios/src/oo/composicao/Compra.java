package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		
	}
	
	double totalCompra() {
		double total = 0;
		for(Item i : itens) {
			total += (i.quantidade * i.preco); 
		}
		
		return total;
	}
	
	
	
}
