package oo.heranca.desafio.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Vilao;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi(10,10);
		Vilao vilao = new Vilao();
				
		vilao.x = 10;
		vilao.y = 11;
		
		heroi.atacar(vilao);
		vilao.atacar(heroi);
		heroi.atacar(vilao);
		
		
		vilao.andar(Direcao.SUL);
		
		
		
		System.out.println("Vida do Heroi "+ heroi.vida+"%");
		System.out.println("Vida do Vilao "+ vilao.vida+"%");
		
	}
}
