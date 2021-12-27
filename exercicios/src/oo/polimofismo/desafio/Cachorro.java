package oo.polimofismo.desafio;

public class Cachorro {
	private String nome;
	private double peso;

	public Cachorro(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public void Come(double comida) {
		this.setPeso(comida + this.getPeso());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", peso=" + peso + "]";
	}

}
