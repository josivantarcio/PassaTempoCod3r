package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Toyota;

public class TesteDrive {
	public static void main(String[] args) {
		Ferrari f1 = new Ferrari(400);
		//Carro corolla2020 = new Toyota();
		
		f1.ligarAr();
		f1.ligarTurbo();
		f1.desligarAr();
		f1.acelerar();
		f1.acelerar();
		f1.acelerar();
		f1.frear();
		f1.frear();
		
		System.out.println(f1.velocidadeDoAr());
		
		System.out.println(f1);
		
	}
}
