package oo.composicao.concessionaria;

public class Moto {
	String chassi;
	String modelo;
	int anoFabricacao;
	double valor;
	Distribuidora distribuidora;
	
	Moto(String chassi, String modelo, int anoFab, double valor) {
		this.chassi = chassi;
		this.valor = valor;
		this.modelo = modelo;
		this.anoFabricacao = anoFab;		
	}

	void adicionarDistribuidora(Distribuidora distri) {
		this.distribuidora.motos.add(this);
		
	}
}
