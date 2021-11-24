package desafios.d1;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void Comer(Comida comida) {
		if (comida != null) {
			peso += comida.pesoComida;
		}
	}
}
