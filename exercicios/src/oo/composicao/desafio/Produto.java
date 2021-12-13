package oo.composicao.desafio;

public class Produto {
	String nomeProduto;
	double precoProduto;
	
	public Produto(String produto, double preco) {
		this.nomeProduto = produto;
		this.precoProduto = preco;
	}
	
	public String toString(){
		return this.nomeProduto +" "+this.precoProduto;
	}
}
