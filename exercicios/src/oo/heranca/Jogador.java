package oo.heranca;



public class Jogador {
	int x;
	int y;
	
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
