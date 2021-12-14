package oo.composicao.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
	final String nome;
	final List<Cliente> clientes = new ArrayList<>();
	
	Vendedor(String nome){
		this.nome = nome;
		
	}
	
	void adicionarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", clientes=" + clientes + "]";
	}
	
	
	
}
