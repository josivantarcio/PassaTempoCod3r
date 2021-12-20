package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		
	}
	
	public void acelerar() {
		if (velocidadeAtual <= VELOCIDADEMAXIMA) {
			velocidadeAtual += 15;
		}
	}

	
}
