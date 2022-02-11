package streams.desafio;

import java.util.Arrays;
import java.util.List;

public class Concessionaria {
	public static void main(String[] args) {

		Estoque car0 = new Estoque("Corolla", 2010, 53000, true);
		Estoque car1 = new Estoque("Brasília", 1978, 7000, false);
		Estoque car2 = new Estoque("Gol", 2015, 21000, false);
		Estoque car3 = new Estoque("Prisma", 2019, 32500, false);
		Estoque car4 = new Estoque("Gol", 2014, 25000, true);

		List<Estoque> stock = Arrays.asList(car0, car1, car2, car3, car4);

		stock.stream()
			.filter(Lambdas.newTires)
			.filter(Lambdas.since)
			.filter(Lambdas.price)
			.map(Lambdas.msg)
			.forEach(Lambdas.printing);

	}
}
