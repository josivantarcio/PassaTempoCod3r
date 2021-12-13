package oo.composicao.desafioAlunoCampeao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nomeCliente;
	final List<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nomeCliente = nome;
	}

	
	double obterValorTotal() {
		double valorTotal = 0;

		for (Compra compra : compras) {
			valorTotal += compra.obterValorCompra();
		}
		return valorTotal;
	}

}
