package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean turbo;
	private boolean ar;
	
	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	public void acelerar() {
		if (velocidadeAtual <= VELOCIDADEMAXIMA) {
			velocidadeAtual += getDelta();
		}
	}

	@Override
	public void ligarTurbo() {
		turbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		turbo = false;
	}
	
	@Override
	public void ligarAr() {
		ar = true;
	}
	
	@Override
	public void desligarAr() {
		ar = false;
	}
	
	@Override
	public int getDelta() {
		if(turbo && !ar) {
			return 35;
		}else if(turbo && ar) {
			return 30;
		}else if(!turbo && !ar) {
			return 20;
		}else {
			return 15;
		}
	}
}
