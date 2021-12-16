package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Jogador();

		
	
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.SUL);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.LESTE);
		
		
		
		System.out.println(j1.x);
		System.out.println(j1.y);
		
	}
}
