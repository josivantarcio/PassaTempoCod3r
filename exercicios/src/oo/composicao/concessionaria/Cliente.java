package oo.composicao.concessionaria;

public class Cliente {
	final String nomeCliente;
	final String cpf;
	Vendedor vendedor;

	public Cliente(String nomeCliente, String cpf) {
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", cpf=" + cpf + ", vendedor=" + vendedor + "]";
	}
	


}
