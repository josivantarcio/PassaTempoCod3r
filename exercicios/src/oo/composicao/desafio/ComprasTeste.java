package oo.composicao.desafio;

public class ComprasTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Maria");
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		
		compra1.adicionarItem("Acucar", 5.20, 2);
		compra1.adicionarItem(new Produto("Valvula", 105.50), 3);
		
		compra2.adicionarItem("Feijao", 7.5, 5);
		compra2.adicionarItem(new Produto("Parafuso", 0.75), 6);
		compra2.adicionarItem("Banana", 1.10, 15);
		
		cliente1.compras.add(compra1);
		cliente1.compras.add(compra2);
		

		
		System.out.println(cliente1.obterValorTotal());
		
		
		

	}
}