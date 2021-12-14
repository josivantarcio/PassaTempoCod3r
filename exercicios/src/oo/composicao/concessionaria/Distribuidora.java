package oo.composicao.concessionaria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Distribuidora {
	Fabrica fabrica;
	String nomeDistribuidora;
	final Set<Moto> motos = new HashSet<>();
	final ArrayList<Vendedor> vendedores = new ArrayList<>();
	
	Distribuidora(String nome){
		this.nomeDistribuidora = nome;
	}
	
	void adicionarFabrica(Fabrica fabrica) {
		fabrica.distribuidoras.add(this);
		this.fabrica.distribuidoras.add(this);
	}
	

}
