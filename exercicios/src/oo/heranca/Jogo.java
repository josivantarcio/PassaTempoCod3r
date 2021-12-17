package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi();
		Vilao vilao = new Vilao();
		
		heroi.x = 10;
		heroi.y = 10;
		
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
