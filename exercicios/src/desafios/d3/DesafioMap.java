package desafios.d3;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
	public static void main(String[] args) {

		/**
		 * DESAFIO: 
		 * 1. Converta para String Binário; 
		 * 2. Inverta a posicao da String; 
		 * 3. Converter para inteiro.
		 **/

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		num.stream()
			.map(Convert.convertBinario)//parte 1
			.map(Convert.inverter)//parte 2
			.map(Convert.reverter)//parte 3
			.forEach(Convert.print);
	}

}
