package oo.heranca.desafio;

public class Toyota extends Carro{
	
	public Toyota(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	
	public Toyota() {
		this(0);
	}
	
	
	public void acelerar() {
		velocidadeAtual += 7;
	}
	
}
