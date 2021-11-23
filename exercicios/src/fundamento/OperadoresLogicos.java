package fundamento;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		boolean saude = (!(trabalhoTerca || trabalhoQuinta));
		
		System.out.println("Comprou a TV de 50\"? "+ (trabalhoTerca && trabalhoQuinta));
		System.out.println("Comprou a TV de 32\"? "+ (trabalhoTerca ^ trabalhoQuinta));
		System.out.println("Comprou Sorvete para a Família? "+ (trabalhoTerca || trabalhoQuinta));
		System.out.println("Saúde está melhor? "+ saude);
		
	}
}
