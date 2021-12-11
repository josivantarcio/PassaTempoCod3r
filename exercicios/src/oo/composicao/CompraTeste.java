package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Francisco";

		compra1.itens.add(new Item("Papel", 4, 2.50));
		compra1.itens.add(new Item("Caneta", 5, 3.99));
		compra1.itens.add(new Item("Lapis", 8, 1.75));
		compra1.adicionarItem(new Item("Borracha", 5, 4.25));

		System.out.println(compra1.itens.size());
		System.out.println(compra1.totalCompra());

	}
}
