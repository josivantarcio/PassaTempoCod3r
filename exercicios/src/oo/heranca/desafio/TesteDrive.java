package oo.heranca.desafio;

public class TesteDrive {
	public static void main(String[] args) {
		Ferrari f1 = new Ferrari();
		Carro corolla2020 = new Toyota();
		
		System.out.println(f1.velocidadeAtual);
		f1.acelerar();
		f1.acelerar();
		f1.frear();
		
		System.out.println(f1.velocidadeAtual);
		
		
		corolla2020.velocidadeAtual = 10;
		System.out.println(corolla2020.velocidadeAtual);
		corolla2020.acelerar();
		corolla2020.acelerar();
		corolla2020.acelerar();
		corolla2020.frear();
		corolla2020.frear();
		corolla2020.frear();
		corolla2020.frear();
		
		System.out.println(corolla2020.velocidadeAtual);
		
	}
}
