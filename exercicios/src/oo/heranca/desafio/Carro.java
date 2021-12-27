package oo.heranca.desafio;

public class Carro{
	public final int VELOCIDADEMAXIMA;
	public int velocidadeAtual;
	private int delta = 5;

	public Carro(int velocidadeMaxima) {
		this.VELOCIDADEMAXIMA = velocidadeMaxima;

	}

	 public void acelerar() {
		if (velocidadeAtual + getDelta() > VELOCIDADEMAXIMA) {
			velocidadeAtual = VELOCIDADEMAXIMA;
		} else {
			velocidadeAtual += getDelta();
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
		return "Carro [VELOCIDADEMAXIMA=" + VELOCIDADEMAXIMA + ", velocidadeAtual=" + velocidadeAtual + "]";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
	
}
