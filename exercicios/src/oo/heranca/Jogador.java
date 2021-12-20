package oo.heranca;

public class Jogador {
	public   int vida = 100;
	public  int num = 10;
	public  int x;
	public  int y;
	
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void atacar(Jogador outroJogador) {
		int posX = Math.abs(x - outroJogador.x);
		int posY = Math.abs(y - outroJogador.y);
		
		if(posX == 0 && posY == 1) {
			outroJogador.vida -= num; 
		}else if(posX == 1 && posY == 0) {
			outroJogador.vida -= num;
		}
	}
	
	public void andar(Direcao direcao) {
		
		switch (direcao) {
		case NORTE:
			x++;
			break;
		case LESTE:
			y++;
			break;
		case SUL:
			x--;
			break;
		case OESTE:
			y--;
			break;
		}
		
	}
}
