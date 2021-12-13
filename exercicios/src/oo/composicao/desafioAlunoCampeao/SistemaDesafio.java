package oo.composicao.desafioAlunoCampeao;

public class SistemaDesafio {
	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Rosa");
		Cliente cl2 = new Cliente("Carla");
		Compra cp1 = new Compra();
		
		cp1.adicionarItem(4, new Produto("celular", 230.25));
		cl1.compras.add(cp1);
		
		Compra cp2 = new Compra();
		cp2.adicionarItem(5, new Produto("anzol", 20.00));
		
		cl2.compras.add(cp2);
		
		System.out.println(cl2.obterValorTotal());
		
	}
}
