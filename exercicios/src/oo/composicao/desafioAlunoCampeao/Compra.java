package oo.composicao.desafioAlunoCampeao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(int quantidade, Produto produto) {
		this.itens.add(new Item(quantidade, produto));
	}

	double obterValorCompra() {
		double somaValor = 0;
		for (Item item : itens) {
			somaValor += item.quantItem * item.produto.precoProduto;
		}
		return somaValor;
	}
}
