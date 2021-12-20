package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Toyota;

public class TesteDrive {
	public static void main(String[] args) {
		Ferrari f1 = new Ferrari(200);
		Carro corolla2020 = new Toyota();
		
		f1.acelerar();
		f1.acelerar();
		f1.frear();
	
		System.out.println(f1.velocidadeAtual);
		
		corolla2020.acelerar();
		corolla2020.frear();
		
		System.out.println(corolla2020.velocidadeAtual);
		
	}
}
