package streams;

public class Media {

	private double nota;
	private int quantidade;
	
	public Media adicionar(double nota) {
		this.nota += nota;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return nota /quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.nota = m1.nota + m2.nota;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
}
