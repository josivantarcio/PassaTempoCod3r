package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
		
	public void adicionarItem(Produto produto, double quantidade) {
		this.itens.add(new Item(quantidade, produto));
	}
	
	public void adicionarItem(String nome, double preco, double quantidade) {
		var prod = new Produto(nome, preco);
		this.itens.add(new Item(quantidade, prod));
	}
	
	public double obterValorCompra() {
		double soma = 0;
		for(Item item : this.itens) {
			soma += item.quantItens * item.produto.precoProduto;
		}
		return soma;
	}
}
