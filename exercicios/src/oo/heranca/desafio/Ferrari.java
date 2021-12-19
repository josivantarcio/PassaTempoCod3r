package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	void acelerar() {
		if (velocidadeAtual <= 220) {
			velocidadeAtual += 15;
		}
	}

	
}
