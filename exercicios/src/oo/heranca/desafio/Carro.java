package oo.heranca.desafio;

public class Carro {
	int velocidadeAtual = 0;
	
	void acelerar() {
		if(velocidadeAtual <= 220) {
			velocidadeAtual += 5;
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
	}
}
