package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADEMAXIMA;
	public int velocidadeAtual = 0;
	protected int delta = 5;

	public Carro(int velocidadeMaxima) {
		this.VELOCIDADEMAXIMA = velocidadeMaxima;

	}

	 public void acelerar() {
		if (velocidadeAtual <= VELOCIDADEMAXIMA) {
			velocidadeAtual += delta;
		} else {
			velocidadeAtual = VELOCIDADEMAXIMA;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		return "Carro [VELOCIDADEMAXIMA=" + VELOCIDADEMAXIMA + ", velocidadeAtual=" + velocidadeAtual + ", delta="
				+ delta + "]";
	}
	
	
	
}
