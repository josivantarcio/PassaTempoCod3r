package oo.composicao.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	String nomeFabrica;
	final List<Distribuidora> distribuidoras = new ArrayList<>();
	
	Fabrica(String nome){
		this.nomeFabrica = nome;
	}
	
	void adicionarDistribuidora(Distribuidora distribuidora) {
		this.distribuidoras.add(distribuidora);
		
	}
}
