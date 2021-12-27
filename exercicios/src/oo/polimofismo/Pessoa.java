package oo.polimofismo;

public class Pessoa {
	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}

	public void comer(Comida comida) {
		setPeso(getPeso() + comida.getPeso());
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (getPeso() >= 0) {
			this.peso = peso;
		}
	}

}
