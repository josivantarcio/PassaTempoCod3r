package oo.polimofismo.desafio;

public class Racao {
	private double quantKiloSaco;

	public Racao() {
		
	}
	
	public Racao(double quantKiloSaco) {
		this.quantKiloSaco = quantKiloSaco;
	} 

	public double getQuantKiloSaco() {
		return quantKiloSaco;
	}

	public void setQuantKiloSaco(double quantKiloSaco) {
		this.quantKiloSaco = quantKiloSaco;
	}

	@Override
	public String toString() {
		return "Racao [quantKiloSaco= " + quantKiloSaco + "]";
	}

}
