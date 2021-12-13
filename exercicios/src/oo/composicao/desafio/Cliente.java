package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nomeCliente;
	List<Compra> compras = new ArrayList<>();

	public Cliente(String nome) {
		this.nomeCliente = nome;
	}

	public double obterValorTotal() {
		double total = 0;

		for (Compra compra : this.compras) {
			total += compra.obterValorCompra();
		}
		return total;
	}
}
