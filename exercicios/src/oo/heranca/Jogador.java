package oo.heranca;

public class Jogador {
	int vida = 100;
	int num = 10;
	int x;
	int y;
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void atacar(Jogador outroJogador) {
		int posX = Math.abs(x - outroJogador.x);
		int posY = Math.abs(y - outroJogador.y);
		
		if(posX == 0 && posY == 1) {
			outroJogador.vida -= num; 
		}else if(posX == 1 && posY == 0) {
			outroJogador.vida -= num;
		}
	}
	
	void andar(Direcao direcao) {
		
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
